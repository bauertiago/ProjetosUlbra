public class Main {
    public static void main(String[] args) {
        CartaoCredito credito = new CartaoCredito();
        System.out.println(credito.realizarPagamento());
        System.out.println(credito.emitirRecibo());
        System.out.println("==============");
        CartaoDebito debito = new CartaoDebito();
        System.out.println(debito.realizarPagamento());
        System.out.println(debito.emitirRecibo());
        System.out.println("==============");
        Dinheiro dinheiro = new Dinheiro();
        System.out.println(dinheiro.realizarPagamento());
        System.out.println(dinheiro.emitirRecibo());
    }
}
