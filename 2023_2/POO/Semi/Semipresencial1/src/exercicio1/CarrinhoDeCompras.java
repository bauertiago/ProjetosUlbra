package exercicio1;

import java.util.ArrayList;

public class CarrinhoDeCompras {
    private ArrayList<Produto> listaDeProdutos = new ArrayList<>();
    private double valorTotal = 0.0;
    public void adicionarAoCarrinho(Produto produto){
        listaDeProdutos.add(produto);
        valorTotal += produto.getValor();
    }

    public double valorTotal() {
        return valorTotal;
    }
}
