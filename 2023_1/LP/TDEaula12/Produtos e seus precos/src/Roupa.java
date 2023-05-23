public class Roupa extends Produto{
    @Override
    public String calcularPreco() {
        return "Preço Roupa";
    }

    @Override
    public String exibirDetalhes() {
        return "Detalhes Roupa";
    }
}
