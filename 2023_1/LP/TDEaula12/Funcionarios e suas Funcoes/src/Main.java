public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        System.out.println(gerente.calcularSalario());
        System.out.println(gerente.realizarTarefa());
        System.out.println("=========");
        Vendedor vendedor = new Vendedor();
        System.out.println(vendedor.calcularSalario());
        System.out.println(vendedor.realizarTarefa());
        System.out.println("=========");
        Estagiario estagiario = new Estagiario();
        System.out.println(estagiario.calcularSalario());
        System.out.println(estagiario.realizarTarefa());
    }
}
