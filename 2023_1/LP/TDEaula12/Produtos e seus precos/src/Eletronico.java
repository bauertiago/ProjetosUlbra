public class Eletronico extends Produto{
    @Override
    public String calcularPreco() {
        return "Preço Eletronico";
    }

    @Override
    public String exibirDetalhes() {
        return "Detalhe Eletronico";
    }
}
