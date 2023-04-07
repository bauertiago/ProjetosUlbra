public class Turma {
    private Aluno aluno1;
    private Aluno aluno2;
    private Aluno aluno3;
    //turma recebendo tres ojetos Aluno como parametros, inicializando aluno1 aluno2 e aluno3 com esses objetos.
    public Turma(Aluno aluno1, Aluno aluno2, Aluno aluno3){
        this.aluno1 = aluno1;
        this.aluno2 = aluno2;
        this.aluno3 = aluno3;
    }

    // método que calcula a média das notas dos alunos da turma. Ele chama o método calcularMedia() para cada aluno e calcula a média dessas notas. Retornando a média da turma.
    public double calcularMedia(){
        double mediaAluno1 = aluno1.calcularMedia();
        double mediaAluno2 = aluno2.calcularMedia();
        double mediaAluno3 = aluno3.calcularMedia();
        double mediaTurma = (mediaAluno1 + mediaAluno2 + mediaAluno3)/3;
        return mediaTurma;
    }
}
