/*1 - Escreva uma SP que receba, como parâmetro, 
o CPF de um autor e retorne a quantidade de livros escrito pelo mesmo.*/

DELIMITER $$
CREATE PROCEDURE qtd_livros_escritos(IN p_cpf_autor CHAR(11), OUT p_qtd INT)
BEGIN
    SELECT COUNT(*) INTO p_qtd FROM livros WHERE cpf_autor = p_cpf_autor;
END$$
DELIMITER ;

CALL qtd_livros_escritos('01234567890');
SELECT * FROM qtd_livros_escritos

/*2 - Crie uma SP que receba, como parâmetro, a data de publicação de um livro e seu código. 
O procedimento deve atualizar a tabela de livros, especificando a data de lançamento para o livro em questão.*/

DELIMITER $$
CREATE PROCEDURE atualizar_data(IN p_id INT, IN p_data_publicacao DATE)
BEGIN
    UPDATE Livros SET data_publicacao = p_data_publicacao
    WHERE id = p_id;
END$$
DELIMITER ;

CALL atualizar_data(10, '2023-03-25');
SELECT * FROM livros;

/*3 - Em algumas situações, SPs são utilizados para a manutenção da segurança do banco de dados. 
Nestes casos, realizamos inclusões, alterações e exclusões de dados, através de SPs. 
Crie SPs que recebem os parâmetros adequados e realizam as seguintes operações:*/

-- a) Inserir uma linha na tabela de livros
DELIMITER $$
CREATE PROCEDURE inserir_linha(
    IN p_titulo VARCHAR(50), 
    IN p_autor VARCHAR(50), 
    IN p_editora VARCHAR(50)
)
BEGIN
    INSERT INTO livros(titulo, autor, editora)
    VALUES(p_titulo, p_autor, p_editora);
END$$
DELIMITER ;

CALL inserir_linha('Stored Procedures', 'Cassio', 'Ulbra');
select * from livros;


-- b) Excluir uma linha da tabela de livros
DELIMITER $$
CREATE PROCEDURE deletar_linha(
    IN p_id INT
)
BEGIN
    DELETE FROM livros
    where id = p_id;
END$$
DELIMITER ;

CALL deletar_linha(2);
select * from livros;


-- c) Atualizar valores na tabela de livros
DELIMITER $$
CREATE PROCEDURE atualizar_valores(
    IN id INT, 
    IN p_titulo VARCHAR(50), 
    IN p_autor VARCHAR(50), 
    IN p_editora VARCHAR(50))
BEGIN
    UPDATE livros SET titulo = p_titulo, autor = p_autor, editora = p_editora
    WHERE id = p_id;
END$$
DELIMITER ; 

CALL atualizar_valores(2, 'Banco de Dados', 'Ramon', 'Ulbra');
select * from livros;


/*4 - Crie uma SP que aumente ou diminua o valor dos preços dos livros de uma editora específica. 
O aumento pode ser em percentual ou em valor.*/

DELIMITER $$
CREATE PROCEDURE ajustar_preco_livros(
    IN p_id_editora INT,
    IN p_preco FLOAT,
    IN percentual FLOAT,
    IN valor FLOAT,
    IN p_opcao char(1)
)
BEGIN
    if(p_opcao = 'P')then
        UPDATE Livros SET preco = p_preco + (p_preco * (percentual / 100))
        WHERE id_editora = p_id_editora;
    elseif(p_opcao = 'V')then
        UPDATE Livros SET preco = p_preco + valor
        WHERE id_editora = p_id_editora;
    else
        select 'Informe P para Adicionar Porcentagem, ou V para adicionar um valor';
    end if;
END $$
DELIMITER ;

CALL ajustar_preco_livros(3, 20.00, 10.00, 2.00, 'P');
-- ou
CALL ajustar_preco_livros(3, 20,00, 10.00, 2.00, 'V');

select * from livros;
