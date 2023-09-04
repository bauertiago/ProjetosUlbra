public abstract class Conta {
    private int numeroDaConta;
    protected double saldo = 0.0;
    private Cliente cliente;


    abstract public void depositar(double valor);
    abstract public void transferir(Conta conta, double valor);
    abstract public double consultarSaldo();

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
