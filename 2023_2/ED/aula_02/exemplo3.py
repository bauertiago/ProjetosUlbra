lista = []

print(""" MENU DE OPÇÕES: 
      1 - PARA INSERIR
      2 - REMOVER O ÚLTIMO
      3 - PARA REMOVER O PRIMEIRO
      4 - INSERIR NO INÍCIO
      5 - IMPRIMIR A LISTA
      6 - IMPRIMIR ÚLTIMO
      7 - REMOVER IMPARES
      8 - REMOVER PARES
      0 - PARA SAIR""")

while True:
    
    opc = int(input("Digite a opção:"))
    
    if opc == 0:
        break

    elif opc == 1:
        num = int(input("Digite o valor:"))
        lista.append(num)
    
    elif opc == 2:
        lista.pop()

    elif opc == 3:
        lista.pop(0)

    elif opc == 4:
        num = int(input("Digite o valor:"))
        lista.insert(0,num)

    elif opc == 5:
        print(lista)
    
    elif opc == 6:
        print(lista[-1])
    
    elif opc == 7:
        for i in lista:
            if i % 2 == 1:
                lista.remove(i)
    
    elif opc == 8:
        for i in lista:
            if i % 2 == 0:
                lista.remove(i)

    else:
        print("Digite um opçao válida!")
    
