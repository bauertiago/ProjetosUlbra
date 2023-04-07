create database exaula01;

use exaula01;

rename table cidade to cidades;

create table cidades
(
	id int auto_increment primary key,
    nome varchar(70) not null,
    uf char(2) not null
);

insert into cidades(nome, uf) values('Torres', 'RS'), ('Passo de Torres', 'SC'), ('Tres Cachoriras', 'RS');

create table filiais
(
	id int auto_increment primary key,
    nome varchar(100) not null,
    endereco varchar(100) not null,
    id_cid int not null,
    constraint cidades_filiais_fk
    foreign key(id_cid) references cidades(id)
		on delete restrict
        on update cascade
);

insert into filiais(nome, endereco, id_cid) values('Atacado T', 'AV geral, 105', 1), ('Atacado R', 'Rua Geral, 476', 2), ('Atacado L', 'Avenida Barão, 1300', 3);

create table empregados
(
	id int auto_increment primary key,
    nome varchar(100) not null,
    endereco varchar(100) not null,
    ct varchar(50),
    rg char(10) not null,
    cpf char(11) not null,
    salario decimal (12,2) not null,
    id_cid int not null,
    id_filial int not null,
		constraint cidades_empregados_fk
			foreign key(id_cid) references cidades(id),
		constraint filiais_empregados_fk
			foreign key(id_filial) references filiais(id)
		on delete restrict
        on update cascade
);

insert into empregados(nome, endereco, rg, cpf, salario, id_cid, id_filial) values('Tiago', 'Rua 1', '1111111111', '12121212121', 950, 1, 2), 
('Rosana', 'Rua 2', '2222222222', '23232323232', 1000, 3, 3), 
('Laura', 'Rua 1', '3333333333', '34343434343', 750, 1, 2);

insert into empregados(nome, endereco, rg, cpf, salario, id_cid, id_filial) values('Cassio', 'Rua 4', '4444444444', '45454545454', 1200, 2, 2);

create table produtos
(
	id int auto_increment primary key,
    descricao varchar(100) not null,
    preco decimal(12,2) not null,
    nome_categoria varchar(100) not null,
    descricao_categoria varchar(100) not null
);

insert into produtos(descricao, preco, nome_categoria, descricao_categoria) VALUES ('TV 55 polegadas', 3250.99, 'Eletrônica', 'dispositivos elétricos'),
('Smartphone S22', 3329.10, 'Celulares', 'Dispositivos Moveis'), ('Ar condicionado', 1300.60, 'Ar e Ventilação', 'dispositivos de ventilação'),
('Geladeira inox', 3100.55, 'Eletrodomésticos', 'Dispositivos de Refrigeração');

create table vendas
(
	id_prod int not null,
    id_filial  int not null,
    constraint produtos_vendas_fk
			foreign key(id_prod) references produtos(id),
		constraint filiais_vendas_fk
			foreign key(id_filial) references filiais(id)
		on delete restrict
		on update cascade
);

insert into vendas(id_prod, id_filial) values(1, 1), (2, 3), (3, 2);

select max(preco)
from produtos;

select avg(preco)
from produtos;

select p.descricao, v.id_filial
from vendas v
	inner join produtos p on v.id_prod = p.id
where v.id_filial = 3;

select e.nome, e.rg, c.uf, e.salario
from empregados e inner join cidades c on e.id_cid = c.id
where c.uf = 'RS' and e.salario > 500;

select *
from empregados