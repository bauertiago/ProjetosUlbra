public class Vendedor extends Funcionario{
    @Override
    public String calcularSalario() {
        return "Salario Vendedor";
    }

    @Override
    public String realizarTarefa() {
        return "Tarefa Vendedor";
    }
}
