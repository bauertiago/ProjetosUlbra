public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente cliente) {
        this.setCliente(cliente);
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Deposito de R$" + valor + ", realizado com sucesso na conta corrente!");
    }

    @Override
    public void transferir(Conta conta, double valor) {
        if(saldo >= valor){
            this.saldo -= valor;
            conta.depositar(valor);
            System.out.println("Tranferencia de R$ " + valor + ", enviada com sucesso!");
        }else{
            System.out.println("Saldo insuficiente!!");
        }
    }

    @Override
    public double consultarSaldo() {
        return this.saldo;
    }
}
