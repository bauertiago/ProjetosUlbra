# Com base nos exemplos anteriores, 
# crie um algoritmo usando uma lista, 
# que simule a implementação de uma estrutura DEQUE, 
# que seja capaz de realizar as seguintes opções de MENU:

from collections import deque

def menu():

    print("""Menu:
1 - Adicionar no Início
2 - Adicionar no final
3 - Exibir Primeiro
4 - Exibir Último
5 - Remover Primeiro
6 - Remover Último
7 - Exibir Lista
0 - Sair""")

def adicionar_inicio(lista, valor):
    lista.appendleft(valor)
    print(f"Valor {valor} adicionado à lista")

def adicionar_final(lista, valor):
    lista.append(valor)
    print(f"Valor {valor} adicionado à lista")

def exibir_primeiro(lista):
    if not lista:
        print("A lista está vazia!")
    else:
        print(f"O primeiro da lista é: {lista[0]}")

def exibir_ultimo(lista):
    if not lista:
        print("A lista está vazia!")
    else:
        print(f"O ultimo da lista é: {lista[-1]}")


def remover_primeiro(lista):
    if not lista:
        print("A lista está vazia")
    else:
        lista.popleft()

def remover_ultimo(lista):
    if not lista:
        print("A lista está vazia")
    else:
        lista.pop()

def exibir_lista(lista):
    if not lista:
        print("A lista está vazia.")
    else:
        for i in lista:
            print(i)

lista = deque()

while True:
    menu()
    opc = int(input("Digite uma opção: "))

    if opc == 1:
        valor = int(input("Digite um número para adicionar ao inicio da lista: "))
        adicionar_inicio(lista,valor)
    elif opc == 2:
        valor = int(input("Digite um número para adicionar ao inicio da lista: "))
        adicionar_final(lista,valor)
    elif opc == 3:
        exibir_primeiro(lista)
    elif opc == 4:
        exibir_ultimo(lista)
    elif opc == 5:
        remover_primeiro(lista)
    elif opc == 6:
        remover_ultimo(lista)
    elif opc == 7:
        exibir_lista(lista)
    elif opc == 0:
        break
    else:
        print("Digite uma opção válida!!")
