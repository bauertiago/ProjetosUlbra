# faça um algoritmo utilizando conceitos de POO representando a utilização de uma fila.
# Crie menu que possibilite adicionar e remover nomes da fila, bem como chamar o próximo a ser atendido.
class Fila:
    def __init__(self):
        self.itens = []
 
    def menu(self):
        while True:
            print("""MENU:
    1- ENFILEIRAR
    2- DESENFILEIRAR
    0- SAIR""")
            opc = int(input("Digite uma opção: "))
            if opc == 1:
                item = input("Digite um número para adicionar à fila: ")
                self.enfileirar(item)
                print("Primeiro da fila: ", minha_fila.exibir_primeiro())
                print("Tamanho da fila:", minha_fila.tamanho())
            elif opc == 2:
                item_chamado = self.desenfileirar()
                if item_chamado is not None:
                    print("Item chamado: ", item_chamado)
                    print("Proximo da fila", minha_fila.exibir_primeiro())
                else:
                    print("A fila está vazia.")
            elif opc == 0:
                print("PROGRAMA ENCERRADO")
                break    
            else:
                print("Digite uma opção válida!!")
        

    
    def vazia(self):
        return len(self.itens) == 0
    
    def tamanho(self):
        return len(self.itens)
    
    def enfileirar(self,item):
        self.itens.append(item)
    
    def desenfileirar(self):
        if not self.vazia():
            return self.itens.pop(0)
        else:
            return None
    
    def exibir_primeiro(self):
        if not self.vazia():
            return self.itens[0]
        else:
            return None
        
    
minha_fila = Fila()
minha_fila.menu()