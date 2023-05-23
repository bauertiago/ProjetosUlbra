public class CartaoDebito extends Pagamento {
    @Override
    public String realizarPagamento(){
        return "pagando com cartão de débito";
    }
    @Override
    public String emitirRecibo(){
        return "Recibo cartão de débito";
    }
}
