public class Estudante {
    private String nome;
    private int matricula;
    private String curso;

    public Estudante(String nome, int matricula, String curso){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public Estudante(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = "Curso de TI";
    }
    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Curso: " + this.curso);
    }
}
