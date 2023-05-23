public class Main {
    public static void main(String[] args) {
        Atacante atacante = new Atacante();
        System.out.println(atacante.atacar());
        System.out.println(atacante.defender());
        System.out.println("===========");
        MeioCampo meioCampo = new MeioCampo();
        System.out.println(meioCampo.atacar());
        System.out.println(meioCampo.defender());
        System.out.println("============");
        Goleiro goleiro = new Goleiro();
        System.out.println(goleiro.atacar());
        System.out.println(goleiro.defender());
    }
}
