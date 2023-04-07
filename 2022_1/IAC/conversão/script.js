//o usuário informa um numero e uma base...


function binaryToDecimal(numero){
    
    
    //console.log(arrNumero)
    //console.log(arrNumero.length + " " + typeof(numero) + typeof(arrNumero));
    var posicao = arrNumero.length-1;
    var resultFormulaAlgarismo = 0
    var resultFinal = 0
    var arrNumero = numero.split('');
    for(i = 0; i<arrNumero.length;i++){
        console.log(arrNumero[i]);
        resultFormulaAlgarismo = (arrNumero[i] * (2 ** posicao));
        console.log(`a*b**2=${resultFormulaAlgarismo}`)
        resultFinal = resultFinal + resultFormulaAlgarismo;
        console.log(`resultFinal= ${resultFormulaAlgarismo}`);
        posicao--;
    }
    return resultFinal;
}


