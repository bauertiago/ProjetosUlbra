public class Gincana {
    private String nomeGincana;
    private int totalEstudantes;
    private Estudante estudanteVencedor;
    private int pontuacaoMaxima;

    public String getNomeGincana(){
        return this.nomeGincana;
    }
    public void setNomeGincana(String nomeGincana) {
        this.nomeGincana = nomeGincana;
    }

    public int getTotalEstudantes(){
        return this.totalEstudantes;
    }
    public void setTotalEstudantes(int totalEstudantes) {
        this.totalEstudantes = totalEstudantes;
    }

    public Estudante getEstudanteVencedor() {
        return this.estudanteVencedor;
    }
    public void setEstudanteVencedor(Estudante estudanteVencedor) {
        this.estudanteVencedor = estudanteVencedor;
    }

    public int getPontuacaoMaxima(){
        return this.pontuacaoMaxima;
    }
    public void setPontuacaoMaxima(int pontuacaoMaxima) {
        this.pontuacaoMaxima = pontuacaoMaxima;
    }

    public void adicionarEstudante(Estudante estudante){
        //atualizando o total de estudantes
        this.totalEstudantes++;
        System.out.println("Estudante Adicionado.");
        System.out.println("O total de estudantes participantes é: " + this.getTotalEstudantes());
        //verificando se o estudante tem mais pontos que o vencedor atual
        if (estudante.getPontos() > this.estudanteVencedor.getPontos()){
            //atualizando o estudante vencedor
            this.estudanteVencedor = estudante;
            //atualizando a pontuação máxima
            this.pontuacaoMaxima = estudante.getPontos();
        }
        System.out.println("estudante vencedor até o momento: " + this.getEstudanteVencedor().getNome() + ", " + this.getPontuacaoMaxima() + " pontos.");

    }

    public void exibirVencedor(){
        System.out.println("A gincana \"" + this.getNomeGincana() + "\", teve como vencedor o(a) estudante: " + this.getEstudanteVencedor().getNome() + " " + this.getEstudanteVencedor().getIdade() + " anos " + ", com total de: " + this.getEstudanteVencedor().getPontos() + " pontos.");
    }
}
