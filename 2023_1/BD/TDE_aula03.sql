/*1 - Escreva uma consulta que retorne o nome do cliente, 
a soma do valor total das compras 
e o número total de pedidos feitos por cada cliente, 
apenas para aqueles que fizeram pelo menos três pedidos. 
Use um inner join entre as tabelas "clientes" e "pedidos" 
e agrupe os resultados pelo nome do cliente.*/

--clientes(id, nome, endereco)
--pedidios(id, id_cliente, data, valor_total)
--produtos(id, nome, preco_unit)
--itens_pedido(id, id_pedido, id_produto, qtd)

select c.i, c.nome as nome_cliente, sum(p.valor_total) as total_compras, count(p.id) as total_pedidos
from pedidos p 
    inner join clientes c 
        on p.id_cliente = c.id
group by c.id, c.nome
having count(p.id) >= 3

/*2 - Escreva uma consulta que retorne o nome do produto, 
a média do preço de venda e a soma total de unidades vendidas por categoria de produto. 
Use um left join entre as tabelas "produtos" e "vendas" 
e agrupe os resultados pela categoria do produto.*/

--produtos(id, nome, categoria)
--vendas(id, id_produto, preco, qtd)

select p.nome as nome_produto, avg(v.preco) as media_preco, sum(v.qtd) as total_vendido, p.categoria as categoria_do_produto
from produtos p 
    left join vendas v
        on p.id = v.id_produto
group by p.categoria

--nesta consulta será selecionados todos os produtos, incluindo os que nao tem vendas registradas

/*3 - Escreva uma consulta que retorne o nome do fornecedor, 
o nome do produto e o número total de unidades compradas por fornecedor 
e por produto, apenas para aqueles com mais de 100 unidades compradas. 
Use um inner join entre as tabelas "fornecedores", "produtos" e "compras" 
e agrupe os resultados pelo nome do fornecedor e pelo nome do produto.*/

-- fornecedores(id, nome, endereco)
-- produtos(id, nome)
-- compras(id, id_fornecedor, id_produto, qtd)
-- compras_produtos (id, id_produto, id_compras)

select f.nome as nome_fornecedor, p.nome as nome_produto, sum(cp.qtd) as quantidade
from compras c 
    inner join fornecedores f 
        on c.id_fornecedor = f.id
    inner join compras_produtos 
        on cp.id_compras = c.id
    inner join produtos p
        on c.id_produto = p.id
group by f.nome, p.nome
having sum(cp.qtd) > 100

/*4 - Escreva uma consulta que retorne o nome do departamento, 
o nome do funcionário e a média do salário dos funcionários em cada departamento, 
apenas para aqueles com uma média de salário superior a R$ 5000. 
Use um left join entre as tabelas "funcionarios" e "departamentos" 
e agrupe os resultados pelo nome do departamento e pelo nome do funcionário.*/

--departamento(id, nome)
--funcionarios(id, nome, salario, id_departamento)

select d.nome as nome_departamento, f.nome as nome_funcionario, avg(f.salario) as media_salario
from departamentos d 
    left join funcionarios f 
        on d.id = f.id_departamento
group by d.nome, f.nome
having avg(f.salario) > 5000

--nesta consulta será selecionados todos os departamentos, incluindo os que nao tem funcionarios registrados

/*Escreva uma consulta que retorne o nome do cliente, 
o nome do produto e a soma do valor total das compras feitas por cada cliente para cada produto. 
Use um right join entre as tabelas "clientes" e "compras" 
e um inner join entre as tabelas "produtos" e "compras" 
e agrupe os resultados pelo nome do cliente e pelo nome do produto.*/

--clientes(id, nome, endereco)
--produtos(id, nome, valor_unit)
--compras(id, id_cliente, id_produto, valor_total)

select c.nome as nome_cliente, p.nome as nome_produto, sum(com.valor_total) as total_compras
from compras com
    right join clientes c
        on com.id_cliente = c.id
    inner join produtos p 
        on c.id_produto = p.id
group by c.nome, p.nome

--nesta consulta o right joinn ira mostar todos os clientes, incluindo os que nao possuem compras registradas.