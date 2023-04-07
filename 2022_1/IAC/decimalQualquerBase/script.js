function octalToDecimal (numero){

var arrNumero = numero.split('');
var operacao = 0;
var posicao = arrNumero.length-1;
var resultado = 0;
for(i = 0; i < arrNumero.length; i++){
    //console.log(arrNumero[i]);
    operacao = (arrNumero[i] * (8 ** posicao));
    //console.log(`a*b**2=${operacao}`)
    resultado += operacao;
    //console.log(`resultado = ${operacao}`);
    posicao--;
}
return resultado;
}