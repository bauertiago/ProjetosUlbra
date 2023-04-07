public class Loja {
    private Produto produto1;
    private Produto produto2;
    private Produto produto3;

    public void adicionarProduto(Produto produto){
        if(produto1 == null){
            produto1 = produto;
        }else if(produto2 == null){
            produto2 = produto;
        }else if(produto3 == null){
            produto3 = produto;
        }else{
            System.out.println("Não foi possível adicionar novo produto.");
        }
    }

    public void removerProduto(Produto produto){
        if(produto1 == produto){
            produto1 = null;
        }else if(produto2 == produto){
            produto2 = null;
        }else if(produto3 == produto){
            produto3 = null;
        }else{
            System.out.println("Poduto não existe");
        }
    }

    public void listarProdutos(Produto produto){
        if(produto1 == produto){
            System.out.println("Produto: " + produto1.getNome() + " - Preço: " + produto1.getPreco() + " - Quantidade: " + produto1.getQuantidade());
        }
        if(produto2 == produto){
            System.out.println("Produto: " + produto2.getNome() + " Preço: " + produto2.getPreco() + " Quantidade: " + produto2.getQuantidade());
        }
        if(produto3 == produto){
            System.out.println("Produto: " + produto3.getNome() + " Preço: " + produto3.getPreco() + " Quantidade: " + produto3.getQuantidade());
        }
    }

    public void venderProduto(Produto produto, int quantidade){
        // verificando se o produto existe
        if(produto == null){
            System.out.println("Produto não encontrado");
        }
        //verificando se tem quantidade suficiente para para venda
        else if(produto.getQuantidade() >= quantidade){
            //acessando o método 'getQuantidade()' obtendo a quantidade atual e subtraindo pela 'quantidade' declarada a ser vendida.
            //o resultado é armazenado como argumento no método 'setQuantidade()'
            produto.setQuantidade(produto.getQuantidade() - quantidade);
            System.out.println("Venda relizada com sucesso");
        }else{
            //se a quantidade for insuficiente
            System.out.println("Produto não disponivel para venda");
        }
    }

    public void adicionarEstoque(Produto produto, int quantidade){
        // verificando se o produto existe
        if(produto == null){
            System.out.println("Produto não encontrado");
        }else{
            //acessando o método 'getQuantidade()' obtendo a quantidade atual somando a 'quantidade' declarada a ser adicionada.
            //o resultado é armazenado como argumento no método 'setQuantidade()'
            produto.setQuantidade(produto.getQuantidade() + quantidade);
            System.out.println("Adicionado ao estoque com sucesso");
        }
    }
}
