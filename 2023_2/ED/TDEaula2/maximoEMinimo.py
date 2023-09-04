def numeros_lista():
    entrada = input("Digite uma lista de números separados por Barra (/)").split("/")
    lista_numeros = []

    for item in entrada:
        try:
            numero = int(item)
            lista_numeros.append(numero)
        except ValueError:
            print(f"Valor inválido: {item}, este valor foi ignorado.")

    print(f"Números da lista: {lista_numeros}")
    return lista_numeros

lista_numeros = numeros_lista()

valor_minimo = min(lista_numeros)
valor_maximo = max(lista_numeros)

print(f"Valor mínimo: {valor_minimo}.")
print(f"Valor máximo: {valor_maximo}.")

            