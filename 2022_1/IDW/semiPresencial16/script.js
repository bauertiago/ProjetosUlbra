//ex 1
function maior10() {
    var valor = parseFloat(prompt("Digite um número:"));
    if (valor > 10) {
        alert(valor + " é maior que 10");
    } else if (valor < 10) {
        alert(valor + " é menor 10");
    } else {
        alert(valor + " é igual a 10");
    }
}

//ex 2
function soma() {
    var numero1 = parseFloat(prompt("digite um número:"));
    var numero2 = parseFloat(prompt("digite outro número:"));
    alert(numero1 + numero2);
}

//ex 3
function operacao() {
    var opcao = prompt(" para soma digite 1\n para subtração digite 2\n para multiplicação digite 3\n para divisão digite 4");
    //console.log(typeof(opcao));
    var numero1 = parseFloat(prompt("digite um número:"));
    var numero2 = parseFloat(prompt("digite outro número:"));
    switch (opcao) {
        case "1":
            //console.log("entrou");
            resultado = numero1 + numero2;
            break;
        case "2":
            resultado = numero1 - numero2;
            break;
        case "3":
            resultado = numero1 * numero2;
            break;
        case "4":
            resultado = numero1 / numero2;
            break;
        default:
            alert("operação inválida")
            break;
    }
    alert("O resultado da operação é: " + resultado)
}

//ex 4

function verificaNome() {
var nome = prompt('Digite um nome')
var numero = parseFloat(prompt('Digite a quantidade de vezes:'))

for (var i = 0; i < numero; i++) {
    alert(nome + ' ' + (i+1) + 'vezes');
}
}

//ex 5
function endereco() {
var informacoes = []
informacoes[0] = prompt('digite seu nome:')
informacoes[1] = prompt('digite seu endereço:')
informacoes[2] = prompt('digite seu email:')

alert('Olá ' + informacoes[0] + ', você mora na ' + informacoes[1] + ', tem o email ' + informacoes[2]) 
}
