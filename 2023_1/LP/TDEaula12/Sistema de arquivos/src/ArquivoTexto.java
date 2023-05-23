public class ArquivoTexto extends Arquivo{
    @Override
    public String abrir(){
        return "Abrindo texto";
    }
    @Override
    public String fechar(){
        return "Fechando texto";
    }
}
