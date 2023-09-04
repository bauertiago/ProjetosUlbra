public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente){
        this.setCliente(cliente);
    }
    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Deposito de R$" + valor + ", realizado com sucesso na conta poupança!");

    }

    @Override
    public void transferir(Conta conta, double valor) {
        if(saldo >= valor){
            this.saldo -= valor;
            conta.depositar(valor);
            System.out.println("Tranferência de R$ " + valor + ", enviada com sucesso!");
        }else{
            System.out.println("Saldo insuficiente!!");
        }
    }

    @Override
    public double consultarSaldo() {
        return this.saldo;
    }
}
