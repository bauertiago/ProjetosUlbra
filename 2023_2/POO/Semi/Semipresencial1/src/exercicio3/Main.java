package exercicio3;

public class Main {
    public static void main(String[] args) {
        ContaCorrente minhaConta = new ContaCorrente();
        ContaCorrente outraConta = new ContaCorrente();

        minhaConta.depositar(200.0);
        System.out.println("Saldo: " + minhaConta.consultarSaldo());

        minhaConta.depositar(100.0);
        System.out.println("Saldo: " + minhaConta.consultarSaldo());

        minhaConta.transferir(outraConta,150.0);
        System.out.println("Saldo: " + outraConta.consultarSaldo());

        outraConta.saque(50.0);
        System.out.println("Saldo: " + outraConta.consultarSaldo());


    }
}
