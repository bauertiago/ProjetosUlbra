def calcular_IMC(peso,altura):
    imc = peso / (altura ** 2)
    return imc

def classificar_IMC(imc):
    if imc < 18.5:
        return "Abaixo do peso"
    elif imc >= 18.5 and imc <=24.9:
        return "Peso normal"
    elif imc >= 25 and imc <= 29.9:
        return "Acima do peso(sobrepeso)"
    elif imc >= 30 and imc <= 34.9:
        return "Obesidade I"
    elif imc >= 35 and imc <= 39.9:
        return "Obesidade II"
    elif imc > 40:
        return "Obesidade III"
    
def valida_entrada(valor):
    try:
        entrada = float(valor)
    except ValueError:
        print("Digite um valor adequado!")
    return entrada

while True:
    peso = valida_entrada(input("Digite seu peso em Kg: "))
    altura = valida_entrada(input("Digite sua altura em metros: "))
    
imc = calcular_IMC(peso, altura)

classificacao = classificar_IMC(imc)

print(f"Seu IMC é: {imc:.2f}")
print(f"A classificação do seu IMC é: {classificacao}")
