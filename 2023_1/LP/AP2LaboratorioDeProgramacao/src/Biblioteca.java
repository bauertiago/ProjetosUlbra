public class Biblioteca {
    private Livro livro1;
    private Livro livro2;
    private Livro livro3;
    private Livro livro4;
    private Livro livro5;

    public void adicionarLivro(Livro livro, int posicao){
        if(posicao < 1 || posicao >5) {
            System.out.println("Número da posição inválido. Digite um número entre 1 e 5.");
            return;
        }
        switch (posicao){
            case 1:
                livro1 = livro;
                break;
            case 2:
                livro2 = livro;
                break;
            case 3:
                livro3 = livro;
                break;
            case 4:
                livro4 = livro;
                break;
            case 5:
                livro5 = livro;
                break;
        }
        System.out.println("Livro adicionado com sucesso!");
    }
    public void removerLivro(int posicao){
        if(posicao < 1 || posicao >5) {
            System.out.println("Número da posição inválido. Digite um número entre 1 e 5.");
            return;
        }
        switch (posicao){
            case 1:
                if(livro1 != null) {
                    livro1.setExcluido(true);
                    livro1 = null;
                    System.out.println("Livro removido com sucesso!");
                } else{
                    System.out.println("Não há livro nesta posição");
                }
                break;
            case 2:
                if(livro2 != null) {
                    livro2.setExcluido(true);
                    livro2 = null;
                    System.out.println("Livro removido com sucesso!");
                } else{
                    System.out.println("Não há livro nesta posição");
                }
                break;
            case 3:
                if(livro3 != null) {
                    livro3.setExcluido(true);
                    livro3 = null;
                    System.out.println("Livro removido com sucesso!");
                } else{
                    System.out.println("Não há livro nesta posição");
                }
                break;
            case 4:
                if(livro4 != null) {
                    livro4.setExcluido(true);
                    livro4 = null;
                    System.out.println("Livro removido com sucesso!");
                } else{
                    System.out.println("Não há livro nesta posição");
                }
                break;
            case 5:
                if(livro5 != null) {
                    livro5.setExcluido(true);
                    livro5 = null;
                    System.out.println("Livro removido com sucesso!");
                } else{
                    System.out.println("Não há livro nesta posição");
                }
                break;
        }
    }
    public void atualizarDetalhesDoLivro(Livro livro,String titulo, String autor, int anoPublicacao, int numPaginas, boolean disponibilidade){
        livro.setTitulo(titulo);
        livro.setAutor(autor);
        livro.setAnoPublicacao(anoPublicacao);
        livro.setNumPaginas(numPaginas);
        livro.setDisponibilidade(disponibilidade);
    }
    public String verificarDisponibilidadeDoLivro(Livro livro) {
        if (livro.isDisponivel()) {
            return "Disponível";
        } else {
            return "Não disponível";
        }
    }

}
