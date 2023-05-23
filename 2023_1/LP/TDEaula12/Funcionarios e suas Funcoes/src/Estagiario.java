public class Estagiario extends Funcionario{
    @Override
    public String calcularSalario() {
        return "Salario Estagiario";
    }

    @Override
    public String realizarTarefa() {
        return "Tarefa Estagiario";
    }
}
