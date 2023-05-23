public class Main {
    public static void main(String[] args) {
        ArquivoTexto texto = new ArquivoTexto();
        System.out.println(texto.abrir());
        System.out.println(texto.fechar());
        System.out.println("========");
        ArquivoImagem imagem = new ArquivoImagem();
        System.out.println(imagem.abrir());
        System.out.println(imagem.fechar());
        System.out.println("========");
        ArquivoAudio audio = new ArquivoAudio();
        System.out.println(audio.abrir());
        System.out.println(audio.fechar());
    }
}
