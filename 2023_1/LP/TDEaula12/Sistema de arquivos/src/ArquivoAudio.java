public class ArquivoAudio extends Arquivo{
    @Override
    public String abrir() {
        return "Abrindo áudio";
    }

    @Override
    public String fechar() {
        return "Fechando áudio";
    }
}
