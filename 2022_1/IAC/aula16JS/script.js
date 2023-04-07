//convenção de escrita

/*
camelCase
    nome
    numero
    nomeCompleto
    valorFinal

PascalCase
    Nome
    Numero
    NomeCompleto
    ValorFinal

snakecase
    nome
    numero
    nome_completo
    valor_final
*/
//alert("Hello world")
document.write("<h1>teste</h1>");

console.log("teste de log");
var nome = "Alice";
console.log(nome);
var numero =10;
var numeroFlutuante=10.99;
console.log(numero);

console.log('o tipo da variável nome é ' + typeof(nome));
console.log(`o tipo da variável numero é ${numero}`);

console.log(typeof(numero));
console.log(typeof(numeroFlutuante));

var expressao = 2 + (4*2 + 20/4) - 3;
console.log(expressao);

//var valTrue = 1 boolean
var fezDeposito = true;
if(fezDeposito){
    console.log("fez deposito " + typeof(fezDeposito));
}else{
    console.log("nao sei");
}

//undefined
var valorUnd;
console.log (typeof(valorUnd) + " - " + valorUnd);

var num = 100;
var test;
console.log