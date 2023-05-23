public class ArquivoImagem extends Arquivo{
    @Override
    public String abrir() {
        return "Abrindo imagem";
    }

    @Override
    public String fechar() {
        return "Fechando imagem";
    }
}
