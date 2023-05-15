public class Programa {
    public static void main(String[] args) {
        Gincana gincana1 = new Gincana();
        gincana1.setNomeGincana("Pega Pega");

        Estudante estudante1 = new Estudante();
        estudante1.setNome("João");
        estudante1.setIdade(15);
        estudante1.setPontos(30);

        Estudante estudante2 = new Estudante();
        estudante2.setNome("Rosana");
        estudante2.setIdade(36);
        estudante2.setPontos(60);

        Estudante estudante3 = new Estudante();
        estudante3.setNome("Lucas");
        estudante3.setIdade(35);
        estudante3.setPontos(55);

        gincana1.adicionarEstudante(estudante1);
        gincana1.adicionarEstudante(estudante2);
        gincana1.adicionarEstudante(estudante3);
        gincana1.exibirVencedor();
    }
}
