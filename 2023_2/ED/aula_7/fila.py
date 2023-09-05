def menu():
 
    print("""MENU:
1- ENFILEIRAR
2- DESENFILEIRAR
3- EXIBIR PRIMEIRO
4- EXIBBIR FILA
5- ENFILEIRAR PRIORITÁRIO
6- DESENFILEIRAR PRIORITÁRIO
7- EXIBIR PRIMEIRO PRIORITÁRIO
8- EXIBIR FILA PRIORITÁRIO
9- CHAMAR PRÓXIMO
0- SAIR""")
    


def enfileirar(lista, valor):
    lista.append(valor)
    print(f"Valor {valor} adicionado à fila {lista}.")

    
def desenfileirar(lista):
    if not lista:
        print("A lista está vazia.")
    else:
        valor = lista[0]
        historico.insert(0,valor)
        lista.pop(0)

def exibir_primeiro(lista):
    if not lista:
        print("A lista está vazia.")
    else:
        print(f"O primeiro da fila é: {lista[0]}")

def exibir_fila(lista):
    if not lista:
        print("A lista está vazia.")
    else:
        for i in lista:
            print(i)

fila = []
fila_prioritarios = []
contador_prioritario = 0
historico = []

while True:
    menu()
    opc = int(input("Digite uma opção: "))

    if opc == 1:
        valor = input("Digite um nome para adicionar à fila: ")
        enfileirar(fila,valor)
    elif opc == 2:
        desenfileirar(fila)
    elif opc == 3:
        exibir_primeiro(fila)
    elif opc == 4:
        exibir_fila(fila)
    elif opc == 5:
        valor = input("Digite um nome para adicionar à fila: ")
        enfileirar(fila_prioritarios,valor)
    elif opc == 6:
        desenfileirar(fila_prioritarios)
    elif opc == 7:
        exibir_primeiro(fila_prioritarios)
    elif opc == 8:
        exibir_fila(fila_prioritarios)
    elif opc == 9:
        if contador_prioritario < 3  and fila_prioritarios:
            print(f"Chamando próximo prioritário: {fila_prioritarios[0]}")
            desenfileirar(fila_prioritarios)
            contador_prioritario += 1
        elif fila:
            print(f"Chamando próximo não prioritário: {fila[0]}")
            desenfileirar(fila)
            contador_prioritario = 0
        else:
            print("Filas vazias.")
    elif opc == 10:
        exibir_fila(historico)
    elif opc == 0:
        break    
    else:
        print("Digite uma opção válida!!")