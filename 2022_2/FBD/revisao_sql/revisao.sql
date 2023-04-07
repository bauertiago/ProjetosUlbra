/*inserindo dados na tabela*/
insert into no_tabela (nome_colunas)
      values('nome_dado');

/*atualizando um dado na tabela*/
update nome_tabela
      set nome_dado=valor_novo
      where chave_identificadora;

/*selecionando dados*/
select *
from nome_tabela;

/*deletando dados*/
delete from nome_tabela
where chave_identificadora;

-- TABELA
/*categorias
id      nome
101     acessorios
102     eletro
103     estofados

produtos
id      nome        preco   id_categoria    data_cad
201     mochila     190,90  101             2022-10-01
202     caneta      13,90   101             2022-10-20
203     celular A10 1002,90 102             2022-11-05
204     tv1000      1990,90 102  
*/

/*listar todos produtos que custam mais que mil reais */
3 select id,nome,preco
1 from produtos
2 where preco>=1000


/*criar uma nova coluna acrescentando 10% ao preço atual*/
select id, nome, preço,(preco*1.10) as novo_preco
from produtos
where preco>=1000
-- resultado
/* id       nome        preco       novo_preco
   203      celular     1002,90     1103,19
   204      tv1000      1990,90     2189,99
*/


/*listar produtos que custam acima de 1000 
e que foram cadastrados no mes de novembro*/
select id, nome, preço,(preco*1.10),data_cad as novo_preco
from produtos
where preco>=1000 and
      data_cad >='2022-11-01' and
      data_cad <='2022-11-30'
/*where preco>=1000 and
      data_cad between
      '2022-11-01' and
      '2022-11-30'*/
-- resultado
/* id       nome        preco       data_cad       novo_preco
   203      celular     1002,90     2022-11-05     1103,19
*/


/*listar a soma dos produtos cadastrados no mês de setembro e outubro*/

select sum(preco) as soma
from produtos
where data_cad >='2022-09-01' and
      data_cad <='2022-10-31'


/*listar quantas tuplas tem*/  
select count(id) as quantos
from produtos 


/*listar os produtos cadastrados e a quais categorias pertencem*/
-- TABELA
/*categorias
id      nome
101     acessorios
102     eletro
103     estofados

produtos
id      nome        preco   id_categoria    data_cad
201     mochila     190,90  101             2022-10-01
202     caneta      13,90   101             2022-10-20
203     celular A10 1002,90 102             2022-11-05
204     tv1000      1990,90 102  
*/
select P.id, P.nome, C.nome as categoria
from produtos P, categorias C
where P.id_categoria = C.id
/*id  nome        nome        categoria
  201 mochila     101
*/
-- TABELA
/*vendas
id      data        id_cliente
1001    2022-05-10  102
1002    2022-07-15  103
1003    2022-10-17  104
1004    2022-10-31  104

vendas_itens
id      id_venda    id_produto  quantidade  valor_unit
90      1001        201             1           188,00
91      1002        202             5           10,00
93      1003        204             1           1000,00
*/

/*quais produtos o cliente id104 comprou no mes de outubro*/
select p.id p.nome, vi.qtd, vi.valor_unit, vi.qtd*vi.valor_unit as valor_total
from produtos p, vendas_itens vi, vendas v
where v.id=vi.id_venda and 
      p.id=vi.id_produto and
      v.id_cliente=104 and
      data >='2022-10-01' and
      data <='2022-10-31'


/*produtos vendidos no mes de outro e o valor total de cada produto vendido*/ 
select p.id p.nome, vi.qtd, vi.valor_unit, vi.qtd*vi.valor_unit as valor_total
from produtos p, vendas_itens vi, vendas v
where v.id=vi.id_venda and 
      vi.id_produto=p.id and
      data >='2022-10-01' and
      data <='2022-10-31'


-- TABELA
/*salas
num
316
317
326
327

alunos
id      sala        nome
1       316         a
2       316         b
3       316         c 
4       317         d
5       317         e 
6       326         f
7       326         g
8       326         h
9       326         i 
10      327         j
*/

/*quantos alunos tem por sala*/
select sala, count(id) as num
from alunos
group by sala

/*soma de alunos nas salas 326 e 327*/
select sala, count(id) as num
from alunos
where sala=326 and sala=327
group by sala


/*qual preco mais alto por categoria*/
select c.nome as categoria, max(p.preco) as val.auto
from categorias c, produtos p
where c.id=p.id_categoria
group by c.nome