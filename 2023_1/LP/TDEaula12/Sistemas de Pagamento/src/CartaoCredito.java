public class CartaoCredito extends Pagamento{
    @Override
    public String realizarPagamento(){
        return "pagando com cartão de crédito";
    }
    @Override
    public String emitirRecibo(){
        return "Recibo cartão de credito";
    }
}
