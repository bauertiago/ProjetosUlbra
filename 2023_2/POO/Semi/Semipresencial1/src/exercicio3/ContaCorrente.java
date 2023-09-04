package exercicio3;

public class ContaCorrente extends Conta{
    @Override
    public void transferir(Conta contaDestino, Double valor) {
        if (saldo >= valor){
            this.saldo -= valor;
            contaDestino.depositar(valor);
            System.out.println("transferência de R$ " + valor + ", realizada com sucesso!");
        }else{
            System.out.println("Saldo Insuficiente!");
        }
    }

    @Override
    public void depositar(Double valor) {
        this.saldo += valor;
        System.out.println("deposito de R$" + valor + ", realizado com sucesso");
    }

    @Override
    public Double consultarSaldo() {
        return this.saldo;
    }

    @Override
    public void saque(Double valor) {
        if(saldo >= valor){
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso");
        }else{
            System.out.println("Saque não autorizado");
        }
    }
}
