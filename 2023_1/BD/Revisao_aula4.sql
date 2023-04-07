Receitas
id      id_cli      data_rec        valor
100     1000        2023-03-10      10000
101     1000        2023-03-11      100
102     1002        2023-03-12      1000
103     1003        2023-03-13      909


Despesas
id      id_for      data_pgto        valor
100     1000        2023-03-10      10
101     1000        2023-03-11      70
102     1002        2023-03-12      1000
103     1003        2023-03-13      350


create view fluxo_caixa
as
select 'R' as tipo, id, id_cli as cod_pessoa, data_rec as data, valor
from Receitas

union all

select 'D' as tipo,id, cod_pessoa, data_pgto as data, valor *(-1)
from despesas 


tipo    id      cod_pessoa      data        valor
R        100     1000        2023-03-10      10000
R        101     1000        2023-03-11      100
R        102     1002        2023-03-12      1000
R        103     1003        2023-03-13      909
D        100     1000        2023-03-10      -10
D        101     1000        2023-03-11      -70
D        102     1002        2023-03-12      -1000
D        103     1003        2023-03-13      -350

select *
from    fluxo_caixa
where   valor < -350 and tipo = 'D'

select  *
from    fluxo_caixa
where   tipo = 'D'
        and data between '2023-02-01' and '2023-02-28'


-- qual o saldo da minha conta agora?
select  sum(valor) as saldo
from    fluxo_caixa

select      tipo, sum(valor) as saldo
from        fluxo_caixa
group by    tipo 