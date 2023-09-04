def contar_vogais(string):
    vogais = "AEIOU"
    contador_vogais = 0

    for char in string:
        if char.upper() in vogais:
            contador_vogais += 1
    
    return contador_vogais

entrada = input("Digite uma frase: ")
qnt_vogais = contar_vogais(entrada)
print("A quantidade de vogais na frase é: ", qnt_vogais)