public class Livro extends Produto{
    @Override
    public String calcularPreco() {
        return "Preço Livro";
    }

    @Override
    public String exibirDetalhes() {
        return "Detalhes Livro";
    }
}
