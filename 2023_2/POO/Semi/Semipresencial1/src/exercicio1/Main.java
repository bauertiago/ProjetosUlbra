package exercicio1;

import exercicio1.CarrinhoDeCompras;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("TV Sansung", 2999.0, "Tela plana, 42 polegadas");
        Produto produto2 = new Produto("Smartphone M32", 1500.0, "Custo benefício");

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarAoCarrinho(produto1);
        carrinho.adicionarAoCarrinho(produto2);

        System.out.println("Valor total do carrinho: " + carrinho.valorTotal());

    }
}