CREATE TABLE colaboradores(
    id INT auto_increment PRIMARY KEY,
    matricula varchar(20) NOT NULL unique, 
    nome VARCHAR(100) NOT NULL,
    senha VARCHAR(20) NOT NULL,
    email VARCHAR(50) NOT NULL,
    id_coordenador INT,
    CONSTRAINT coordenadores_fk_colaboradores
        FOREIGN KEY(id_coordenador) REFERENCES colaboradores(id)
);

CREATE TABLE departamentos(
    id INT auto_increment PRIMARY KEY,
    nome VARCHAR(100) NOT NULL
);

CREATE TABLE projetos(
    id INT auto_increment PRIMARY KEY, 
    nome VARCHAR(100) NOT NULL,
    descricao VARCHAR(200),
    estimativa_duracao INT NOT NULL
);

CREATE TABLE projetos_colaboradores(
    id INT auto_increment PRIMARY KEY, 
    id_colaborador INT NOT NULL,
    id_projeto INT NOT NULL,
    CONSTRAINT colaboradores_fk_projetos_colaboradores
        FOREIGN KEY(id_colaborador) REFERENCES colaboradores(id),
    CONSTRAINT projetos_fk_projetos_colaboradores
        FOREIGN KEY(id_projeto) REFERENCES projetos(id)
);

CREATE TABLE projetos_comentarios(
    id INT NOT NULL auto_increment PRIMARY KEY,
    data_e_hora DATETIME NOT NULL,
    id_projeto INT NOT NULL,
    id_colaborador INT NOT NULL,
    CONSTRAINT projetos_fk_projetos_comentarios
        FOREIGN KEY(id_projeto) REFERENCES projetos(id),
    CONSTRAINT colaboradores_fk_projetos_comentarios
        FOREIGN KEY(id_colaborador) REFERENCES colaboradores(id)
);

CREATE TABLE projetos_melhoria_processos(
    id INT auto_increment PRIMARY KEY,
    resultados_esperados VARCHAR(1000) NOT NULL,
    id_projeto INT NOT NULL,
    id_departamento INT NOT NULL,
    CONSTRAINT projetos_fk_projetos_melhoria_processos
        FOREIGN KEY(id_projeto) REFERENCES projetos(id)
        ON DELETE CASCADE,
    CONSTRAINT departamento_fk_projetos_melhoria_processos
        FOREIGN KEY(id_departamento) REFERENCES departamentos(id)
        ON DELETE RESTRICT
        on UPDATE CASCADE

);

CREATE TABLE projeto_sociais(
    id INT auto_increment PRIMARY KEY,
    publico_beneficiario VARCHAR(100) NOT NULL,
    id_projeto INT NOT NULL,
    CONSTRAINT projetos_fk_projetos_sociais
        FOREIGN KEY(id_projeto) REFERENCES projetos(id)
        ON DELETE CASCADE
);

-- alter table
ALTER TABLE projetos ADD COLUMN data_criacao DATE;
ALTER TABLE projetos DROP COLUMN data_criacao;

