create database exaula2;
drop database exaula2;
use exaula2;

create table clientes
(
	id int auto_increment primary key,
    nome varchar(100) not null,
    endereco varchar(100) not null,
    telefone varchar(11) not null
);

insert into clientes(nome,endereco,telefone)
values('construsul', 'Arroio do Sal', '5199999999'),
	('construfacil', 'Rondinha', '51888888888'),
    ('construforte', 'Perola', '51777777777'),
    ('PedrãoMC', 'Arroio do sal', 51555555555);

create table funcionarios
(
	id int auto_increment primary key,
    nome varchar(100) not null,
    cargo varchar(50) not null,
    data_admissao date not null
);

insert into funcionarios(nome,cargo,data_admissao)
values('Tiago', 'Operador', '2013-09-13'),
	('Pedro', 'Operador', '2015-04-3'),
    ('Kiko', 'Operador', '2010-09-13');

create table maquinas
(
	id int auto_increment primary key,
    modelo varchar(50) not null,
    id_func int not null,
    constraint funcionarios_maquinas_fk
    foreign key(id_func) references funcionarios(id)
		on delete restrict
        on update cascade
);

insert into maquinas(modelo, id_func) 
values('Hyundai ls220', 1), ('JCB 210', 2), ('xcmg 190', 3);

create table produtos
(
	id int auto_increment primary key,
    descricao varchar(15) not null,
    preco_m3 decimal(10,2) not null    
);

insert into produtos(descricao, preco_m3)
values ('Arenosa', 14.00), ('Argila', 12.00), ('Terra Orgânica', 18.00);

create table caminhoes
(
	id int auto_increment primary key,
    placa varchar(7) not null,
    id_cliente int not null,
    constraint clientes_caminhoes_fk
    foreign key(id_cliente) references clientes(id)
		on delete restrict
        on update cascade
);

insert into caminhoes(placa, id_cliente) 
values('abc0d00', 1), ('abc0d11', 1), ('abc0d22', 1), 
('abc0d33', 2), ('abc0d44', 2), ('abc0d55', 3), ('abc0d66', 3);

create table vendas
(
	id int auto_increment primary key,
    data date not null,
    qnt_carga float not null,
    id_cliente int not null,
    id_caminhao int not null,
    id_prod int not null,
    id_maq int not null,
    constraint clientes_vendas_fk
    foreign key(id_cliente) references clientes(id),
    constraint caminhoes_vendas_fk
    foreign key(id_caminhao) references caminhoes(id),
    constraint produtos_vendas_fk
    foreign key(id_prod) references produtos(id),
    constraint maquinas_vendas_fk
    foreign key(id_maq) references maquinas(id)
		on delete restrict
        on update cascade
);

insert into vendas(data, qnt_carga, id_prod, id_cliente, id_caminhao, id_maq)
values('2023-01-04', 12, 1, 1, 1, 1), ('2023-01-04', 12, 1, 1, 2, 1), ('2023-01-04', 10, 1, 1, 3, 1), 
('2023-01-04', 12, 1, 2, 4, 1), ('2023-01-04', 12, 1, 2, 5, 1), ('2023-01-04', 10, 2, 1, 3, 2), 
('2023-01-04', 12, 1, 3, 6, 1), ('2023-01-04', 12, 1, 2, 5, 1), ('2023-01-04', 12, 2, 1, 1, 2),
('2023-02-05', 12, 1, 1, 2, 1), ('2023-02-05', 12, 2, 2, 5, 2), ('2023-02-05', 12, 2, 1, 1, 2),
('2023-02-05', 12, 1, 3, 6, 1), ('2023-02-05', 12, 1, 2, 5, 1), ('2023-03-02', 10, 2, 1, 3, 2);

select * 
from vendas;

select v.data, v.id_maq, f.nome
from maquinas m
	inner join vendas v on v.id_maq = m.id	
    inner join funcionarios f on  m.id = f.id
    where v.data = '2023-01-04';
    
select v.data, count(v.id_maq), f.nome
from maquinas m
	inner join vendas v on v.id_maq = m.id	
    inner join funcionarios f on  m.id = f.id
    where v.data = '2023-01-04'
    group by f.nome
 
