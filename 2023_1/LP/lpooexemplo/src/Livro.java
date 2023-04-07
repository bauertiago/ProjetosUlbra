import java.util.Date;
public class Livro {
    String isbn;
    int numPaginas;
    String nome;

    public void emprestar(int dias){
        System.out.println("Emprestado por" + dias + "dias");
    }
    public Date emprestar(Date data){
        return data;
    }
    public void emprestar(Cliente c, Date data){

    }
    public void devolver(int dias){
        System.out.println("Será devolvido depois de " + dias + " dias");
    }
}
