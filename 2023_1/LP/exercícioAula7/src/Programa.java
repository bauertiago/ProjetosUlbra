public class Programa {
    public static void main(String[] args) {
        //Criando produtos e declarando o valor dos parametros
        Produto produto1 = new Produto();
        produto1.setNome("Caneta");
        produto1.setPreco(12.0);
        produto1.setQuantidade(10);

        Produto produto2 = new Produto();
        produto2.setNome("Borracha");
        produto2.setPreco(2.0);
        produto2.setQuantidade(15);

        Produto produto3 = new Produto();
        produto3.setNome("Caderno");
        produto3.setPreco(25.90);
        produto3.setQuantidade(4);

        //Criando loja
        Loja loja = new Loja();

        //Adicionar produto
        loja.adicionarProduto(produto1);
        loja.adicionarProduto(produto2);
        loja.adicionarProduto(produto3);

        //listando os produtos adicionados
        loja.listarProdutos(produto1);
        loja.listarProdutos(produto2);
        loja.listarProdutos(produto3);

        //Remover produto
        loja.removerProduto(produto2);

        //Vender produto
        loja.venderProduto(produto1,2);

        //Adicionar estoque
        loja.adicionarEstoque(produto1,3);

        //listando os produtos adicionados
        System.out.println("Lista de produtos após as operações: ");
        loja.listarProdutos(produto1);
        loja.listarProdutos(produto2);
        loja.listarProdutos(produto3);
    }
}
