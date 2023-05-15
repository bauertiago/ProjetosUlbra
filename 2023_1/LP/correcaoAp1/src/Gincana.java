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
        this.totalEstudantes++;
        if(this.estudanteVencedor == null || estudante.getPontos() > this.pontuacaoMaxima){
            this.estudanteVencedor = estudante;
            this.pontuacaoMaxima = estudante.getPontos();
        }
    }

    public void exibirVencedor(){
        System.out.println("Estudante vencedor:");
        System.out.println("Nome: " + this.getEstudanteVencedor().getNome());
        System.out.println("Pontos: " + this.getEstudanteVencedor().getPontos());
    }
}
