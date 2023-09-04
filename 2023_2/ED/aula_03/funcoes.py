def saudacao(nome):
    print("Olá, " + nome + "! Bem vindo(a) à aula slobre funções.")

saudacao("João") # Saída: Ola, João! Bem vindo(a) à aula sobre funções.

def calcular_media(nota1, nota2):
    media = (nota1 + nota2) / 2
    return media

resultado = calcular_media(7.5, 8.2)
print("A média é:", resultado)

def soma(a, b):
    return a + b
resultado = soma(2, 3)
print("A soma é:", resultado)

def dividir(a, b):
    quociente = a // b
    resto = a % b
    return quociente, resto

resultado_quociente, resultdo_resto = dividir(10, 3)
print(resultado_quociente, resultdo_resto)

texto = "Olá, mundo!"
tamanho = len(texto)
print(tamanho)

numeros = [1, 2, 3, 4, 5]
soma = sum(numeros)
print(soma)

dobrar = lambda x: x * 2
print(dobrar(5))

somar = lambda a, b: a + b
print(somar(2, 3))