create database semiPresencial;
drop database semiPresencial;
use semiPresencial;

create table Clientes(
	id int primary key auto_increment not null,
    nome varchar(70) not null
);
insert into Clientes(nome)
values('Maria'),
('João'),
('Pedro'),
('Ana'),
('Rafael'),
('Carla'),
('Fernanda'),
('Lucas'),
('Camila'),
('Gustavo');

create table Livros(
	id int primary key auto_increment not null,
    titulo varchar(100) not null,
    valor_unit decimal(10,2) not null
);
insert into Livros(titulo,valor_unit)
values ('Grande Sertão: Veredas', 29.90),
('Dom Casmurro', 39.90),
('O Alienista', 44.90),
('Capitães da Areia', 19.99),
('Vidas Secas', 49.99),
('Música ao Longe', 29.90),
('O Tempo e o Vento', 39.99),
('Memórias Póstumas de Brás Cubas', 24.90),
('Incidente em Antares', 44.50),
('A Hora da Estrela', 34.90);

create table Autores(
	id int primary key auto_increment not null,
    nome varchar(70) not null
);
insert into Autores(nome)
values('Érico Veríssimo'),
('Jorge Amado'),
('Machado de Assis'),
('João Guimarães Rosa'),
('Graciliano Ramos'),
('Clarice Lispector');

create table Autores_livros(
	id_autor int not null,
    id_livro int not null,
	constraint Autores_Autores_livros_fk
		foreign key (id_autor) references Autores(id),
	constraint Livros_Autores_livros_fk
		foreign key (id_livro) references Livros(id)
);
insert into Autores_livros(id_autor, id_livro)
values(1,6), (1,7), (1,9), (2,4), (3,2), (3,3), (3,8), (4,1), (5,5),(6,10);

create table Vendas(
	id int primary key auto_increment not null,
    data date not null,
    id_cliente int not null,
    constraint Clientes_Vendas_fk
		foreign key (id_cliente) references Clientes(id)
);
insert into Vendas(data, id_cliente)
values('2023-01-20', 1), ('2023-01-20',2), ('2023-01-20', 3), ('2023-01-23', 4), ('2023-02-03', 5), ('2023-02-05', 6);

create table Vendas_livros(
	id int primary key auto_increment not null,
    qtd int not null,
    valor_unit decimal(10,2) not null,
    id_livro int not null,
    id_venda int not null,
    constraint Livros_Vendas_livros_fk
		foreign key (id_livro) references Livros(id),
	constraint Vendas_Vendas_Livros_fk
		foreign key (id_venda) references Vendas(id)
);

insert into Vendas_livros(qtd, valor_unit, id_livro, id_venda) 
values(3, 39.90, 2, 1), (1, 44.50, 9, 1), (2, 39.99, 7, 2), (1, 49.99, 5, 2), (4, 19.99, 4, 2),
(2, 39.99, 7, 3), (1, 44.50, 9, 4), (3, 39.90, 2, 5), (2, 29.90, 6, 6);

select * from Vendas_livros;

/*Crie uma view chamada "livros_mais_vendidos" que exiba o título, 
autor, preço e a quantidade de vezes que cada livro foi vendido.*/
create view livros_mais_vendidos as
select L.titulo, A.nome as nome_autor, Vl.valor_unit as preco, sum(Vl.qtd) as quantas_vendas
from Vendas_livros Vl 
	inner join Livros L on L.id = Vl.id_livro
	inner join Autores_livros Al on Al.id_livro = L.id
	inner join Autores A on A.id = Al.id_autor
group by L.titulo
order by quantas_vendas desc;

select *
from livros_mais_vendidos;

-- Crie uma view que lista os autores que nunca venderam livros.

/*create view Autores_sem_venda as
select A.nome as nome_autor
from Autores A 
	left join Autores_livros Al on A.id = Al.id_autor
    left join Vendas_livros Vl on Vl.id_livro = Al.id_livro
where Vl.id_venda is null
group by A.nome;

select * 
from Autores_sem_venda;*/

create view autores_sem_vendas as
select a.nome as nome_autor
from Autores a
where not exists(
    select *
    from Autores_livros al
    inner join Vendas_livros vl on al.id_livro = vl.id_livro
    where al.id_autor = a.id
    );

select *
from autores_sem_vendas;


-- mostre a soma das vendas realizadas em janeiro de 2023, os livros mais vendido nesta data, mostrando a quantidade destes livros e o outor.
create view Vendas_janeiro as
select sum(Vl.qtd * Vl.valor_unit) as valor_total, L.titulo as livros_mais_vendidos, sum(Vl.qtd) as quantas_vezes, A.nome as autor
from  Vendas V 
	inner join Vendas_livros Vl on V.id = Vl.id_venda
	inner join Livros L on L.id = Vl.id_livro
	inner join Autores_livros Al on Al.id_livro = L.id
	inner join Autores A on A.id = Al.id_autor    
where V.data >= '2023-01-01' and V.data <= '2023-01-31'
group by L.id
order by sum(Vl.qtd) desc;

select *
from Vendas_janeiro;

-- Utilizando a view para mostrar o total de todas as vendas realizadas no mês de janeiro de 2023:
select sum(valor_total) as valor_total_mes
from Vendas_janeiro;