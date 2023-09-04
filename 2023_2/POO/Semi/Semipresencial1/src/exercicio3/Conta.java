package exercicio3;

abstract public class Conta {
    protected double saldo = 0.0;
    abstract public void transferir(Conta contaDestino, Double valor);
    abstract public void depositar(Double valor);
    abstract public Double consultarSaldo();
    abstract public void saque(Double valor);

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
