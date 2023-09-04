numeros_validos = []
entrada = input("Digite uma sequência de números sepados por virgula:").split(",")

for item in entrada:
    try:
        numero = int(item)
        numeros_validos.append(numero)
    except ValueError:
        print(f"Valor inválido: {item}. Este valor foi ignorado.")
print(f"Os valores válidos são: {numeros_validos}.")

def soma_pares(lista):
    soma = 0
    for num in lista:
        if num % 2 == 0:
            soma += num
    return soma
    
resultado = soma_pares(numeros_validos)
print("A soma dos números pares é:", resultado)
