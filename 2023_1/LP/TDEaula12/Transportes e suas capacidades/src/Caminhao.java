public class Caminhao extends Transporte{
    @Override
    public String carregar() {
        return "Caminhão carregando";
    }

    @Override
    public String descarregar() {
        return "Caminhão descarregando";
    }
}
