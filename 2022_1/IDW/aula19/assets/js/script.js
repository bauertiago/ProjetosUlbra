$(document).ready(function () {
    /*function removeCssAtivo(){
        $('#menu_calculadora').removeClass('active')
        $('#menu_conta').removeClass('active')
        $('#menu_verifica_maior').removeClass('active')
        $('#menu_idade').removeClass('active')
    }*/

    $('#menu_calculadora').click(function () {
     // removeCssAtivo()
     // $('#menu_calculadora').addClass('active')
     
        $('section').load('calculadora.html', function () {
            $('#calcular').click(function () {
                var num1 = parseFloat($('#num1').val())
                var num2 = parseFloat($('#num2').val())
                var operacao = $('#operacao').val()
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
                $('#resultado').html( num1 + operacao + num2 + ' = ' + resultado)
            })
        })
    })

    $('#menu_conta').click(function () {
      //removeCssAtivo()
      //$('#menu_conta').addClass('active')
        $('section').load('conta_energia.html', function () {
            $('#calcular_conta').click(function () {
                var quantidade = parseFloat($('#quantidadeKwh').val())
                var valorUnitario = parseFloat($('#valorUnitario').val())
                var valorFinal = quantidade * valorUnitario

                if (quantidade > 100 && quantidade <= 200) {
                    valorFinal = valorFinal * 1.25
                } else if (quantidade > 200) {
                    valorFinal = valorFinal * 1.5
                }
                $('#valorConta').html('O valor da conta é R$ ' + valorFinal)
            })
        })
    })

    $('#menu_verifica_maior').click(function () {
      //removeCssAtivo()
      //$('#menu_verifica-maior').addClass('active')
        $('section').load('verifica_maior.html', function () {
            $('#verMaior').click(function () {
                var numeros = $('#numeros').val()
                numeros = numeros.split(',')
                var maior = 0
                for (var i = 0; i < numeros.length; i++) {
                    var valorAtual = parseFloat(numeros[i])
                    if (maior < valorAtual) {
                        maior = valorAtual
                    }
                }
                $('#maiorNumero').html('O maior número é ' + maior)
            })
        })
    })

    $('#menu_idade').click(function () {
      //removeCssAtivo()
      //$('#menu_idade').addClass('active')
        $('section').load('maior_idade.html', function () {
            $('#verIdades').click(function () {
                var idades = $('#idades').val()
                idades = idades.split(',')
                var maiorIdade = 0
                var menorIdade = 0

                for (var i = 0; i < idades.length; i++) {
                    var idadeAtual = parseFloat(idades[i])
                    if (idadeAtual < 18) {
                        menorIdade++
                    } else {
                        maiorIdade++
                    }
                }
                $('#mostraIdades').html( + menorIdade + ' idades são menores de 18 anos e ' + maiorIdade + ' idades são maiores ou iguais a 18 anos.')
            })
        })
    })
})