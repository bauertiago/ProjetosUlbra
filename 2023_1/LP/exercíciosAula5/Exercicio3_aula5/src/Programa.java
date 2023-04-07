public class Programa {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta("A12345");
        conta.setTitular("João Carlos");
        conta.setSaldo(1000.00);

        System.out.println("Numero da conta: " + conta.getSaldo());
        System.out.println("Nome do titular da conta: " + conta.getTitular());
        System.out.println("Saldo atual: " + conta.getSaldo());

        conta.depositar(100.00);

        System.out.println("Saldo após deposito: " + conta.getSaldo());

        conta.sacar(50.00);

        System.out.println("Saldo após saque: " + conta.getSaldo());
    }
}
