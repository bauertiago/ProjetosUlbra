public class Trem extends Transporte{
    @Override
    public String carregar() {
        return "Trem carregando";
    }

    @Override
    public String descarregar() {
        return "Trem descarregando";
    }
}
