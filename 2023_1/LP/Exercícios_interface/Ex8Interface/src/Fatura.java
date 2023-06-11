public class Fatura implements Pagavel{

    @Override
    public void pagar() {
        System.out.println("Pagar Fatura");
    }

    @Override
    public void verificarPagamento() {
        System.out.println("Verificar pagamento da fatura");
    }
}
