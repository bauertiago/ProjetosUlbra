public class CartaoDeMemoria extends DispositivoArmazenamento{
    @Override
    public String lerDados() {
        return "Lendo dados do Cartão de Memória";
    }

    @Override
    public String gravarDados() {
        return "Gravando dados no Cartão de Memória";
    }
}
