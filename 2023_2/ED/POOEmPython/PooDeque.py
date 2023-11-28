from collections import deque

class Itens_deque:
    def __init__(self):
        self.itens = []
    
    def menu(self):
        while True:
            print("""MENU:
    1- Adicionar no Início
    2- Adicionar no Final
    3- Remover Início
    4- Remover Ultimo
    5- Exibie Itens
    0- SAIR""")
            opc = int(input("Digite uma opção: "))
            if opc == 1:
                item = input("Digite um número para adicionar no início: ")
                self.adicionar_inicio(item)
                print("Primeiro do deque: ", meu_deque.exibir_primeiro())
                print("Ultimo do deque: ", meu_deque.exibir_ultimo())
                print("Tamanho do deque:", meu_deque.tamanho())
            elif opc == 2:
                item = input("Digite um número para adicionar no final: ")
                self.adicionar_final(item)
                print("Primeiro da fila: ", meu_deque.exibir_primeiro())
                print("Ultimo do deque: ", meu_deque.exibir_ultimo())
                print("Tamanho da fila:", meu_deque.tamanho())
            elif opc == 3:
                removido_inicio = self.remover_primeiro()
                if removido_inicio is not None:
                    print("Item Removido: ", removido_inicio)
                else:
                    print("A fila está vazia.")
            elif opc == 4:
                removido_final = self.remover_ultimo()
                if removido_final is not None:
                    print("Item Removido: ", removido_final)
            elif opc == 5:
                self.exibir_itens
            elif opc == 0:
                print("PROGRAMA ENCERRADO")
                break    
            else:
                print("Digite uma opção válida!!")
    
    def vazia(self):
        return len(self.itens) == 0
    
    def tamanho(self):
        return len(self.itens)
    
    def adicionar_inicio(self, valor):
        self.itens.appendleft(valor)
        print(f"Valor {valor} adicionado à lista")

    def adicionar_final(self, valor):
        self.itens.append(valor)
        print(f"Valor {valor} adicionado à lista")
    
    def exibir_primeiro(self):
        if not self.vazia():
            return self.itens[0]
        else:
            return None
        
    def exibir_ultimo(self):
        if not self.vazia():
            return self.itens[-1]
        else:
            return None
        
    def exibir_itens(self):
        if not self.vazia():
            return self.itens
        else:
            return None
        
    def remover_primeiro(self):
        if not self.vazia():
            return self.itens.popleft()
        else:
            return None
        
    def remover_ultimo(self):
        if not self.vazia():
            return self.itens.pop()
        else:
            return None
        
meu_deque = Itens_deque()
meu_deque.menu()