public class Gerente extends Funcionario{
    @Override
    public String calcularSalario() {
        return "Salario Gerente";
    }

    @Override
    public String realizarTarefa() {
        return "Tarefa Gerente";
    }
}
