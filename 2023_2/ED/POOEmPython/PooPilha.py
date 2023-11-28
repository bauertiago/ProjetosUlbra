class Pilha:
    def __init__(self):
        self.itens = []

    def vazia(self):
        return len(self.itens) == 0

    def tamanho(self):
        return len(self.itens)

    def empilhar(self, item):
        self.itens.append(item)

    def desempilhar(self):
        if not self.vazia():
            return self.itens.pop()
        else:
            return None

    def topo(self):
        if not self.vazia():
            return self.itens[-1]
        else:
            return None

# Exemplo de uso:
minha_pilha = Pilha()
minha_pilha.empilhar(1)
minha_pilha.empilhar(2)
minha_pilha.empilhar(3)

print("Topo da pilha:", minha_pilha.topo())
print("Tamanho da pilha:", minha_pilha.tamanho())

item_desempilhado = minha_pilha.desempilhar()
print("Item desempilhado:", item_desempilhado)

print("Topo da pilha após desempilhar:", minha_pilha.topo())
print("Tamanho da pilha após desempilhar:", minha_pilha.tamanho())