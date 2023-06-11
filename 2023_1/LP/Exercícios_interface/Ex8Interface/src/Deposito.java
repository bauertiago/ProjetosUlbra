public class Deposito implements Pagavel{
    @Override
    public void pagar() {
        System.out.println("Pagar deposito");
    }

    @Override
    public void verificarPagamento() {
        System.out.println("Verificar depósito");
    }
}
