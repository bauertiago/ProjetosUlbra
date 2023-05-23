public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();
        System.out.println(livro.calcularPreco());
        System.out.println(livro.exibirDetalhes());
        System.out.println("===========");
        Roupa roupa = new Roupa();
        System.out.println(roupa.calcularPreco());
        System.out.println(roupa.exibirDetalhes());
        System.out.println("===========");
        Eletronico eletronico = new Eletronico();
        System.out.println(eletronico.calcularPreco());
        System.out.println(eletronico.exibirDetalhes());

    }
}
