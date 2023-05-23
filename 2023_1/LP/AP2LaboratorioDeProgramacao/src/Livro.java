public class Livro extends Produto {
    private String autor;
    private int anoPublicacao;
    private boolean disponibilidade;
    private int numPaginas;
    private boolean excluido;

    public Livro(String titulo, String autor, int anoPublicacao, int numPaginas, boolean disponibilidade){
        super(titulo);
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponibilidade = disponibilidade;
        this.numPaginas = numPaginas;
    }



    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public boolean isDisponivel() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public void setExcluido(boolean excluido) {
        this.excluido = excluido;
    }

    @Override
    public String detalhesDoProduto(){
        String textoDisponibilidade = isDisponivel() ? "Disponível" : "Não disponível";
        if(excluido){
            return "Produto não encontrado";
        }
        return "Titulo: " + getTitulo() + "\nAutor: " + getAutor() + "\nAno de Publicação: " + getAnoPublicacao() + "\nDisponibilidade: " + textoDisponibilidade;
    }
    public String detalhesDoProduto(boolean incluirNumPaginas) {
        String textoDisponibilidade = isDisponivel() ? "Disponível" : "Não disponível";
        String detalhes = "Título: " + getTitulo() + "\nAutor: " + getAutor() + "\nAno de Publicação: " + getAnoPublicacao() + "\nDisponibilidade: " + textoDisponibilidade;

        if (incluirNumPaginas) {
            detalhes += "\nNúmero de Páginas: " + getNumPaginas();
        }

        return detalhes;
    }
}
