# Criar um algoritmo que recebe um número ou sequência de números, separados por virgula.
# Os números devem ser inteiros, e armazenados em uma lista.
# O algoritmo deve ter um menu:
# 1- Adicionar números
# 2- Remover Último
# 3- Limpar Lista
# 4- imprimir Lista
# 5- Imprimir Último
# 0 - Sair

# Realizada a tarefa anterior, acrescente a funcionalidade de a cada remoção de item da pilha, este seja armazenado em uma outra pilha.

numeros = []
nova_pilha = []

print(""" MENU:
      1 - ADICIONAR NÚMEROS
      2 - REMOVER ÚLTIMO E ADICIONAR À NOVA PILHA
      3 - LIMPAR LISTA
      4 - IMPRIMIR LISTA E NOVA PILHA
      5 - IMPRIMIR ÚLTIMO
      0 - SAIR
    """)
while True:
    opc = int(input("Digite a opção: "))

    if opc == 0:
        break

    elif opc == 1:
        entrada = input("Digite o valor: ")
        entrada_tratada = entrada.split(",")
        for i in entrada_tratada:
            try:
                num = int(i)
                numeros.append(num)
            except ValueError:
                print(f"valor {i} inválido")
          
    elif opc == 2:
        elemento_retirado = numeros.pop()
        nova_pilha.append(elemento_retirado)
            
    elif opc == 3:
        numeros.clear()
       
    elif opc == 4:
        print(numeros)
        print(nova_pilha)
    
    elif opc == 5:
        print(numeros[-1])

    else:
        print("Digite uma opção válida")
