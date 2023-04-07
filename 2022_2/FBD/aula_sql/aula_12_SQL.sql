/*CREATE TABLE colaboradores(
    matricula INT auto_increment PRIMARY KEY, 
    senha VARCHAR(20) NOT NULL,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(50) NOT NULL
);

CREATE TABLE cordenadores(
    id INT auto_increment PRIMARY KEY,
    matricula_colaborador INT NOT NULL,
    CONSTRAINT fk_colaboradores_cordenadores
        FOREIGN KEY(matricula_colaborador) REFERENCES colaboradores(matricula)
);

CREATE TABLE projetos(
    id INT auto_increment PRIMARY KEY, 
    nome VARCHAR(100) NOT NULL,
    cordenador_id INT NOT NULL,
    CONSTRAINT fk_cordenadores_projetos
        FOREIGN KEY(cordenador_id) REFERENCES cordenadores(id)
);

CREATE TABLE comentarios(
    id INT auto_increment PRIMARY KEY,
    data_criacao DATE,
    texto TEXT NOT NULL,
    projeto_id INT NOT NULL,
    matricula_colaborador INT NOT NULL,
    CONSTRAINT fk_projetos_comentarios
        FOREIGN KEY(projeto_id) REFERENCES projetos(id),
    CONSTRAINT fk_colaboradores_comentarios
        FOREIGN KEY(matricula_colaborador) REFERENCES colaboradores(matricula)
);

CREATE TABLE categoria_social(
    id INT auto_increment PRIMARY KEY,
    tipo_projeto VARCHAR(30) NOT NULL,
    publico_beneficiario VARCHAR(50) NOT NULL,
    CONSTRAINT fk_projetos_categoria_social
        FOREIGN KEY(tipo_projeto) REFERENCES projetos(id)
);

CREATE TABLE categoria_melhoria_processo(
    id INT auto_increment PRIMARY KEY,
    tipo_projeto VARCHAR(30) NOT NULL,
    nome_departamento VARCHAR(50) NOT NULL,
    CONSTRAINT fk_projeto_categoria_melhoria
        FOREIGN KEY(tipo_projeto) REFERENCES projetos(id),
    CONSTRAINT fk_departamento_categoria
        FOREIGN KEY(nome_departamento) REFERENCES departamento(id)
);

CREATE TABLE departamento(
    id INT auto_increment PRIMARY KEY,
    nome VARCHAR(50) NOT NULL
);*/

