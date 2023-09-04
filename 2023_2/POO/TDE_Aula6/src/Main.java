public class Main {
    public static void main(String[] args) {
        Cliente tiago = new Cliente("Tiago", 35);
        Cliente rosana = new Cliente("Rosana",36);
        Cliente laura = new Cliente("Laura", 5);

        ContaCorrente conta1 = new ContaCorrente(tiago);
        ContaCorrente conta2 = new ContaCorrente(rosana);

        ContaPoupanca conta3 = new ContaPoupanca(laura);

        System.out.println("Titular da Conta Corrente: " + conta1.getCliente().getNome() + "\nIdade: " + conta1.getCliente().getIdade() + " anos!");
        System.out.println("Titular da conta Poupança: " + conta3.getCliente().getNome() + "\nIdade: " + conta3.getCliente().getIdade() + " anos!");

        System.out.println("Saldo conta corrente 1: " + conta1.consultarSaldo());
        System.out.println("Saldo conta corrente 2: " + conta2.consultarSaldo());
        System.out.println("Saldo conta poupança 3: " + conta3.consultarSaldo());


        conta1.depositar(500.0);
        conta3.depositar(600.0);
        System.out.println("Saldo conta corrente 1: " + conta1.consultarSaldo());
        System.out.println("Saldo conta corrente 2: " + conta2.consultarSaldo());
        System.out.println("Saldo conta poupança 3: " + conta3.consultarSaldo());

        conta1.transferir(conta2,300.0);
        conta3.transferir(conta2,300.0);
        System.out.println("Saldo conta corrente 1: " + conta1.consultarSaldo());
        System.out.println("Saldo conta corrente 2: " + conta2.consultarSaldo());
        System.out.println("Saldo conta poupança 3: " + conta3.consultarSaldo());
    }
}