
cliente(id, nome)
produtos(id, nome)
vendas(id, data, id_cliente)
vendas_produtos(id_venda, id_produto, quant, valor_unit)
formas_pgto(id, nome)
vendas_formas_pgtos(id_venda, id_forma_pgto, valor, quantas_vezes)

-- mostrar todos as editoras que nao tem livros cadastrados

select livros.id, livros.titulo, editoras.nome as editora
from livros 
        RIGHT JOIN editoras
           on livros.id_editora = editoras.id
where id_editora IS NULL

--Listar todos os produtos vendidos no mes de fev. de 2023

select p.nome, sum(vp.qtd) as qtd_vendida, sum(vp.qtd + vp.val_unit) as valor_total
from vendas v 
    inner join vendas_produtos vp
        on  v.id = vp.id_venda
    inner join produtos p
        on vp.id_produto = p.id
where v.data >='2023-02-01' and v.data <='2023-02-28'
group by p.nome
order by valor_total desc

/*
id      produto     qtd_vendida     valor_total
100     coca cola   1000            2500
101     mouse       20              450
102     pasta       100             200
*/

-- listar o valor total de vendas por forma de pagamento no mes de fev. 23
select f.nome as formas_pgto, coalesce(sum(vfp.valor),0) as total
from formas_pgto f
    left join vendas_formas_pgtos vfp
        on f.id = vfp.id_forma_pgto
    left join vendas v
        on v.id = vfp.id_venda
where v.data >='2023-02-01' and v.data <='2023-02-28'
group by f.nome

/*
deve retornar
forma_pgto  total
dinheiro    10000
cartao      40000
crediario   0
cheque      0
*/