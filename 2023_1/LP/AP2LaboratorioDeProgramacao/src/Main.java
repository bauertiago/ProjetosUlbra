public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, 600, true);
        Livro livro2 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997, 500, true);
        Livro livro3 = new Livro("1984", "George Orwell", 1949, 250,false);
        Livro livro4 = new Livro("Dom Casmurro", "Machado de Assis", 1899, 350, false);
        Livro livro5 = new Livro("Vidas Secas","Graciliano Ramos", 1938, 400, false);
        Livro livro6 = new Livro("Dona Flor e Seus Dois Maridos", "Jorge Amado", 1966, 200, true);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(livro1,1);
        System.out.println(livro1.detalhesDoProduto());
        System.out.println("===============================");

        biblioteca.adicionarLivro(livro2,2);
        System.out.println(livro2.detalhesDoProduto(true));
        System.out.println("===============================");

        biblioteca.adicionarLivro(livro3,3);
        System.out.println(livro3.detalhesDoProduto());
        System.out.println("===============================");

        biblioteca.adicionarLivro(livro4,4);
        System.out.println(livro4.detalhesDoProduto());
        System.out.println("===============================");

        biblioteca.adicionarLivro(livro5,6);
        System.out.println(livro5.detalhesDoProduto());
        System.out.println("===============================");

        biblioteca.adicionarLivro(livro6,3);
        System.out.println(livro6.detalhesDoProduto());
        System.out.println("===============================");

        biblioteca.removerLivro(1);
        System.out.println(livro1.detalhesDoProduto());
        System.out.println("===============================");

        biblioteca.atualizarDetalhesDoLivro(livro2,"Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997, 900, true);
        System.out.println(livro2.detalhesDoProduto(true));
        System.out.println("===============================");
        System.out.println("O livro pesquisado: " + biblioteca.verificarDisponibilidadeDoLivro(livro4));
    }
}
