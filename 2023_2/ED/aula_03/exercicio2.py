def obter_numeros():
    entrada = input("Digite uma lista de números separados por espaço: ").split()
    numeros_validos = []

    for item in entrada:
        try:
            numero = float(item)
            numeros_validos.append(numero)
        except ValueError:
            print(f"Valor inválido: {item}. Ignorando este valor.")

    print(f"Os números válidos são estes: {numeros_validos}.")
    return numeros_validos

def soma_elementos(lista):
    soma = 0
    for num in lista:
        soma += num
    return soma

numeros_validos = obter_numeros()

resultado = soma_elementos(numeros_validos)
print("A soma dos elementos é:", resultado)
