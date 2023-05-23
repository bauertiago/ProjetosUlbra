public class Dinheiro extends Pagamento {
    @Override
    public String realizarPagamento(){
        return "pagando com dinheiro";
    }
    @Override
    public String emitirRecibo(){
        return "Recibo dinheiro";
    }
}
