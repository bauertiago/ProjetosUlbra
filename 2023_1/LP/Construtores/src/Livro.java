public class Livro {
    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = 15.90;
    }
    public void imprimirLivros(){
        System.out.println("titulo: " + this.titulo);
        System.out.println("Nome do autor: " + this.autor);
        System.out.println("preco: " + this.preco);
    }
}
