public class Cheque implements Pagavel{
    @Override
    public void pagar() {
        System.out.println("Pagar cheque");
    }

    @Override
    public void verificarPagamento() {
        System.out.println("Verificar pagamento do cheque");
    }
}
