-- aqui é um comentario

/*
comentario em blocos
*/

-- padrão de escrita
/*
    tabelas plural
    atributos singular

    snake_case (usado no SQL)
    camelCase (js)
    PascalCase (outraas Linguagem)
    Abreviações em letra Maiúscula
    */

 --clientes(id int pk, nome char(100));
 --enderecos(id int pk, logradouro char(100), numero int, bairro, cidade, estado);

/*
create table nome_da_tabela
(
    nome_do_atributo | dominio | vazios | chaves,
    nome_do_atributo | dominio | vazios | chaves
);
*/

create table clientes(
    id int not null primary key,
    nome varchar(100) not null,
    CPF char(14) not null unique
);

CREATE TABLE enderecos(
    id INT NOT NULL PRIMARY KEY,
    logradouro VARCHAR(100) NOT NULL,
    numero VARCHAR(10),
    bairro VARCHAR(100),
    cidade VARCHAR(100),
    estado CHAR(2),
    id_cliente INT NOT NULL,
        CONSTRAINT fk_clientes_enderecos
            FOREIGN KEY(id_cliente) REFERENCES clientes(id)
);

CREATE TABLE engenheiros(
    id INT NOT NULL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL
);

CREATE TABLE projetos(
    id INT NOT NULL PRIMARY KEY,
    nome VARCHAR(250) NOT NULL
);

CREATE TABLE atuacoes(
    id_engenheiros INT NOT NULL,
    id_projetos INT NOT NULL,
    CONSTRAINT fk_engenheiros_atuacoes
    FOREIGN KEY(id_engenheiros) REFERENCES engenheiros(id),
    CONSTRAINT fk_projetos_atuacoes
    FOREIGN KEY(id_projetos) REFERENCES projetos(id)
);

CREATE TABLE aluno(
    id INT auto_increment PRIMARY KEY,
    nome VARCHAR (100) NOT NULL
);

CREATE TABLE departamento(
    id INT auto_increment PRIMARY KEY,
    nome VARCHAR (100) NOT NULL
);

CREATE TABLE curso(
    id INT auto_increment PRIMARY KEY,
    nome VARCHAR (100) NOT NULL,
    id_depto INT NOT NULL,
    CONSTRAINT fk_departamento_curso
        FOREIGN KEY(id_depto) REFERENCES departamento(id)
);

CREATE TABLE professor(
    id INT auto_increment PRIMARY KEY,
    nome VARCHAR (100) NOT NULL
);

CREATE TABLE disciplina(
    id INT auto_increment PRIMARY KEY,
    nome VARCHAR (100) NOT NULL,
    id_prof INT NOT NULL,
    CONSTRAINT fk_professor_disciplina
        FOREIGN KEY(id_prof) REFERENCES professor(id)
);

CREATE TABLE matricula(
    matricula INT auto_increment PRIMARY KEY,
    data_matr DATE,
    id_disciplina INT NOT NULL,
    id_aluno INT NOT NULL,
    CONSTRAINT fk_disciplina_matricula
        FOREIGN KEY(id_disciplina) REFERENCES disciplina(id),
    CONSTRAINT fk_aluno_matricula
        FOREIGN KEY(id_aluno) REFERENCES aluno(id)
);



--TDE AULA 01

create table colaboradores(
    id INT auto_increment PRIMARY KEY,
    senha varchar(20) not null primary key,
    matricula int auto_increment primary key,
    nome varchar(100) not null,
    email varchar(50) not null
);

CREATE TABLE cordenadores(
    id INT auto_increment PRIMARY KEY,
    colaboradorID int not null,
    CONSTRAINT fk_colaboradores_cordenadores
        FOREIGN KEY(colaborador_id) REFERENCES colaboradores(id)
);

create table projetos(
    id int auto_increment primary key, 
    nome varchar(100) not null,
    cordenadorID int not null,
    CONSTRAINT fk_cordenadores_projetos
        FOREIGN KEY(cordenador_id) REFERENCES cordenador(id)

  );