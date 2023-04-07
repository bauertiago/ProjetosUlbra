public class Aluno {
    private Prova prova1;
    private Prova prova2;

    // Construtor público da classe que recebe dois objetos Prova
    // e inicializa os campos prova1 e prova2 com esses objetos.
    public Aluno(Prova prova1, Prova prova2){
        this.prova1 = prova1;
        this.prova2 = prova2;
    }
    //método para calcular a media do aluno, chamando o método calcularNotaTotal() de cada prova
    // e somando as notas obtidas. Retornando a soma das duas notas dividido por 2.
    public double calcularMedia(){
        double notaTotal = prova1.calcularNotaTotal() + prova2.calcularNotaTotal();
        return notaTotal/2;
    }
}
