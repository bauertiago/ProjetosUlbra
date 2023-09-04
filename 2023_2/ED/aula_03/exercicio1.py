

numeros_validos = []

entrada = input("Digite uma lista de números separados por espaço: ").split()

for item in entrada:
    try:
        numero = float(item)
        numeros_validos.append(numero)
    except ValueError:
        print(f"Valor inválido: {item}. Ignorando este valor.")

print(f"Os números válidos são estes: {numeros_validos}.")

soma = 0
for num in numeros_validos:
    soma += num

print("A soma dos elementos é:", soma)