public class Programa {
    public static void main(String[] args) {
        //criando os objetos estudantes
        Estudante estudante1 = new Estudante();
        estudante1.setNome("Tiago");
        estudante1.setIdade(34);
        estudante1.setPontos(50);

        Estudante estudante2 = new Estudante();
        estudante2.setNome("Rosana");
        estudante2.setIdade(36);
        estudante2.setPontos(60);

        Estudante estudante3 = new Estudante();
        estudante3.setNome("Lucas");
        estudante3.setIdade(35);
        estudante3.setPontos(55);

        //criando o objeto gincana
        Gincana gincana = new Gincana();
        gincana.setNomeGincana("Gincana ADS");
        gincana.setTotalEstudantes(0);
        gincana.setEstudanteVencedor(estudante1);
        gincana.setPontuacaoMaxima(estudante1.getPontos());

        //adicionar estudantes
        gincana.adicionarEstudante(estudante1);
        gincana.adicionarEstudante(estudante2);
        gincana.adicionarEstudante(estudante3);

        //mostrando o estudante vencedor, que obteve a maior pontuação
        gincana.exibirVencedor();
    }
}