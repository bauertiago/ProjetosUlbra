public class Main {
    public static void main(String[] args) {
        Fatura fatura = new Fatura();
        Cheque cheque = new Cheque();
        Deposito deposito = new Deposito();

        fatura.pagar();
        fatura.verificarPagamento();
        System.out.println("==============");
        cheque.pagar();
        cheque.verificarPagamento();
        System.out.println("==============");
        deposito.pagar();
        deposito.verificarPagamento();
    }
}
