function calcular() {
    var num1 = parseFloat(document.getElementById('num1').value)
    var num2 = parseFloat(document.getElementById('num2').value)
    var operacao = document.getElementById('operacao').value
    var resultado
    
    switch (operacao) {
        case '+':
            resultado = num1 + num2
        break;
        case '-':
            resultado = num1 - num2
        break;
        case '*':
            resultado = num1 * num2
        break;
        case '/':
            resultado = num1 / num2
        break;
    }
    document.getElementById('resultado').innerHTML = 'O resultado é ' + resultado
    
}

function calcularConta() {
    var quantidade = parseFloat(document.getElementById('quantidadeKwh').value)
    var valorUnitario = parseFloat(document.getElementById('valorUnitario').value)
    var valorFinal = quantidade * valorUnitario

    if(quantidade > 100 && quantidade <= 200){
        valorFinal = valorFinal * 1.25
    }else if(quantidade > 200){
        valorFinal = valorFinal * 1.5
    }

    document.getElementById('valorConta').innerHTML = 'O valor da conta é R$ ' + valorFinal + ',00'
}

function verMaior() {
    var numeros = document.getElementById('numeros').value
    numeros = numeros.split(',')
    var maior = 0
    for(var i=0; i < numeros.length; i++) {
        var valorAtual = parseFloat(numeros[i])
        if(maior < valorAtual){
            maior = valorAtual
        }
    }
    document.getElementById('maiorNumero').innerHTML = 'O maior número é ' + maior
}

function verIdades() {
    var idades = document.getElementById('idades').value
    idades = idades.split(',')

    var maiorIdade = 0
    var menorIdade = 0

    for(var i=0; i < idades.length; i++) {
        var idadeAtual = parseFloat(idades[i])
        if(idadeAtual < 18){
            menorIdade++
        }else{
            maiorIdade++
        }
    }
    document.getElementById('mostraIdades').innerHTML = menorIdade + ' idades são menores de 18 anos e ' + maiorIdade + ' idades são maiores ou iguais a 18 anos.'
}