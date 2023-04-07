-- Exercício 1
create table editoras(
    id int auto_increment not null primary key,
    nome varchar(40) not null
);

create table assuntos (
    id char(1) not null primary key,
    descricao varchar(40) not null
);

create table autores (
    matricula int auto_increment not null primary key,
    nome varchar(40) not null,
    CPF varchar(11) not null unique key,
    endereco varchar (100) ,
    data_nascimento date not null,
    nacionalidade varchar (30)
);

create table livros(
    id int auto_increment not null primary key,
    titulo varchar(80) not null,
    preco decimal (12,2) not null,
    lancamento date,
    id_assunto char(1) not null,
    id_editora int not null,
    constraint assuntos_fk_livros
        foreign key(id_assunto) references assuntos(id)
        ON UPDATE cascade
        ON DELETE restrict,
    constraint editoras_fk_livros
        foreign key (id_editora) references editoras(id)
        ON UPDATE cascade
        ON DELETE restrict
);

create table autores_livros(
nome varchar(40) not null,
matricula_autores int not null,
id_livro int not null,
constraint autores_fk_autores_livros
    foreign key (matricula_autores) references autores(matricula)
    ON UPDATE cascade
    ON DELETE restrict,
constraint livros_fk_autores_livros
    foreign key (id_livro) references livros(id)
    ON UPDATE cascade
    ON DELETE restrict
);

-- exercício 2
--2 – Crie os SQLs solicitados abaixo. 
--a)Monte comandos de inclusão das tabelas do Banco de dados Criado de acordo com os dados das tabelas abaixo:
--renomeando tabelas
alter table editoras 
RENAME COLUMN id TO codigo;

alter table assuntos
RENAME COLUMN id TO sigla;

alter table livros
RENAME COLUMN id to código;

 -- excluuindo foreign key

alter table livros
DROP FOREIGN KEY assuntos_fk_livros;

alter table livros
DROP FOREIGN KEY editoras_fk_livros;

alter table autores_livros
DROP FOREIGN KEY livros_fk_autores_livros;

--adicionando novamente foreign key com atributos atualizados.

alter table livros
add CONSTRAINT assuntos_fk_livros
FOREIGN KEY (id_assunto) REFERENCES assuntos(sigla);

alter table livros
add CONSTRAINT editoras_fk_livros
FOREIGN KEY (id_editora) REFERENCES editoras(codigo);

alter table livros
add CONSTRAINT editoras_fk_livros
FOREIGN KEY (id_editora) REFERENCES editoras(codigo);

alter table autores_livros
add CONSTRAINT livros_fk_autores_livros
FOREIGN KEY (id_livro) REFERENCES livros(código);



Insert into editoras(nome) VALUES ('Mirandela Editora'),('Editora Via-Norte'),('Editora Ilhas Tijucas'),('Maria José Editora');

insert into assuntos(sigla, descricao) VALUES ('B','Banco de dados'),('P','Programação'),('R','Redes'),('S','Sistemas Operacionais');

insert into livros(titulo, preco, lancamento,id_editora, id_assunto) VALUES 
    ('Banco de Dados para a Web',31.20, '1999-01-10', '1', 'B'),
    ('Programando em linguagem C', 30.00, '1997-10-01','1','P'),
    ('Programando em linguagem C++', 111.50, '1998-11-01', '3','P'),
    ('Banco de dados na bioinformatica', 48.00, '', '2','B');
    ('Redess de computadores',42.00,'1996-09-01','2','R');


--3 – Crie comandos SQLs que retorne os dados solicitados abaixo.
--Monte um comando para excluir da tabela livros aqueles que possuem o código maior ou igual a 2, 
--que possuem o preço maior que R$ 50,00 e que já foram lançados.
DELETE 
FROM livros  
WHERE codigo >=2 AND preco >50 AND lancamento < CURRENT_DATE;

--Escreva o comando que seleciona as colunas NOME, CPF e ENDERECO, da tabela AUTOR, para aqueles que possuem a palavra ‘joão’ no nome.
insert into autores(nome,cpf, endereco,data_nascimento,nacionalidade) values('joao cardoso', 05645678912,'rua das margaridas', '1989-10-05','brasileira');

select nome, CPF, endereco
from autores
where nome like '%joão%';

--Excluir o livro cujo título é ‘BANCO DE DADOS DISTRIBUÍDO’ ou ‘BANCOS DE DADOS DISTRIBUÍDOS’. Somente essas duas opções devem ser consideradas.
insert into livros(titulo, preco, lancamento,id_editora, id_assunto) VALUES 
    ('Bancos de Dados distribuidos',41.20, '1999-01-10', '1', 'B'),
    ('Banco de Dados distribuido',100.20, '1998-03-10', '3', 'B');
DELETE 
FROM livros  
WHERE titulo = 'BANCO_ DE DADOS DISTRIBUÍDO_';

--Selecione o nome e o CPF de todos os autores que nasceram após 01 de janeiro de 1990.
Insert into autores(nome,cpf, endereco,data_nascimento,nacionalidade) values('LAURA MATOS', 05645698812,'FAXINAL', '2018-10-14','brasileira');
select nome, CPF
from autores 
where data_nascimento > '1990-01-01';

--Selecione a matrícula e o nome dos autores que possuem RIO DE JANEIRO no seu endereço.
INSERT INTO autores(nome, cpf, data_nascimento, endereco, nacionalidade) VALUES 
    ('ROBERTO CARLOS', '01067548786', '1998-11-30', 'Rio De Janeiro', 'brasileira');

select matricula, nome
from autores
where endereco like '%rio de janeiro%';

--Atualize para zero o preço de todos os livros onde a data de lançamento for nula ou onde seu preço atual for inferior a R$ 55,00.
update livros
set preco = 0
where lancamento is null or preco < 55;

--Exclua todos os livros onde o assunto for diferente de ‘S’, ‘P’, ou ‘B’.
delete 
from livros 
where id_assunto <> 'S' and id_assunto <> 'P' and id_assunto <> 'B';
where id_assunto not in('p','b')
--Escreva o comando para contar quantos são os autores cadastrados na tabela AUTORES.
select COUNT(matricula) as quantidade
from autores;

--Escreva o comando que apresenta qual o número médio de autores de cada livro. Você deve utilizar, novamente, a tabela AUTOR_LIVRO. 

select avg(quantos) as autorPorLivro
from (
    select id_livro, count(matricula_autores) as quantos
    from autores_livros
    group by id_livro
)as nova_consulta


--Apresente o comando SQL para gerar uma listagem dos códigos dos livros que possuem a menos dois autores.
select id_livro, count(matricula_autores) as quantos
from autores_livros
group by id_livro
having quantos>=2

--Escreva o comando para apresentar o preço médio dos livros por código de editora. Considere somente aqueles que custam mais de R$ 45,00.
select avg(preco),id_editora as media_preco
from livros
where preco > 45
group by id_editora;

--Apresente o preço máximo, o preço mínimo e o preço médio dos livros cujos assuntos são ‘S’ ou ‘P’ ou ‘B’, para cada código de editora.
select id_editora, max(preco) as preco_maximo, min(preco) as preco_minimo, avg(preco)
from livros
where id_assunto = 'P' id_assunto = 'S' id_assunto = 'B'
where id_assunto in('S','P','B')
group by id_editora;

--Altere o comando do exercício anterior para só considerar os livros que já foram lançados (data de lançamento inferior a data atual) e cujo o preço máximo é inferior a R$ 100,00
select id_editora, max(preco) as preco_maximo, min(preco) as preco_minimo, avg(preco)
from livros
where id_assunto in('S','P','B') and lancamento < CURRENT_DATE
group by id_editora
having preco_maximo < 100;

--Nos exercícios com junções de tabelas, utilize JOINS.
--Estão sendo estudados aumentos nos preços dos livros. Escreva o comando SQL que retorna uma listagem contendo o titulo dos livros, e mais três colunas: uma contendo os preços dos livros acrescidos de 10% (deve ser chamada de ‘Opção_1’), a segunda contendo os preços acrescidos de 15% (deve ser chamada de ‘Opção_2’) e a terceira contendo os preços dos livros acrescidos de 20% (deve ser chamada de ‘Opção_3’). Somente devem ser considerados livros que já tenham sido lançados
SELECT l.titulo, l.preco * 1.10 as Opção_1, l.preco * 1.15 as Opção_2, l.preco * 1.20 as Opção_3
from livros l 
where lancamento < CURRENT_DATE;

/*
b
Escreva o comando SQL que apresenta uma listagem contendo o código da editora,
 o nome da editora, a sigla do assunto e o título dos livros que já foram lançados.
  Os dados devem estar em ordem decrescente de preço, e ascendente de código da editora 
  e de título do livro.
*/

SELECT e.id, e.nome, l.assunto_id, l.titulo, l.preco
from livros l 
        inner join editoras e ON e.id = l.editora_id
where l.data_lancamento < CURRENT_DATE
order by l.preco DESC, e.id ASC, l.titulo ASC


/*
c
Escreva o comando SQL que apresenta uma listagem contendo o código da editora,
Escreva o comando que apresente uma listagem dos nomes dos autores e do 
seu ano e mês de nascimento, para os autores brasileiros e que tem livros ainda não 
lançados. A listagem deve estar ordenada em ordem crescente de nome.
*/
SELECT a.nome, year(a.data_nasc) as ano, month(a.data_nasc) as mes, day(a.data_nasc) as dia
from livros l 
		inner join autores_livros al on al.livro_id = l.id
        inner join autores a on a.id = al.autor_id

where l.data_lancamento > CURRENT_DATE and l.data_lancamento is null
order by a.nome ASC


/*
d
Escreva o comando que retorna o nome dos autores e o título dos livros de sua autoria. 
A listagem deve estar ordenada pelo nome do autor, mostrar somente os livros já lançados.
*/
SELECT a.nome as autor, l.titulo as titulo_do_livro
from livros l 
		inner join autores_livros al on al.livro_id = l.id
        inner join autores a on a.id = al.autor_id

where l.data_lancamento <CURRENT_DATE and l.data_lancamento is not null
order by a.nome ASC




/*
e
Monte a consulta SQL que retorna as editoras que publicaram livros escritos pela autora
 'Ana da Silva'
*/
SELECT e.id, e.nome
from  livros l 
		inner join autores_livros al on al.livro_id = l.id
        inner join autores a on a.id = al.autor_id
        inner join editoras e ON e.id = l.editora_id
where l.data_lancamento < CURRENT_DATE and a.nome like '%ana da silva%'


/*
f
FUS que apresente o CPF, nome do autor e o preço máximo dos livros de sua autoria. 
Apresente somente as informações para os autores cujo preço máximo for superior a 50.
*/
SELECT a.nome, l.titulo, max(l.preco) as maximo
from  livros l 
		inner join autores_livros al on al.livro_id = l.id
        inner join autores a on a.id = al.autor_id
group by a.nome, l.titulo
having maximo>50
