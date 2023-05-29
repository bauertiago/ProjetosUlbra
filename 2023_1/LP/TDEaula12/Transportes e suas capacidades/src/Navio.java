public class Navio extends Transporte{
    @Override
    public String carregar() {
        return "Navio carregando";
    }

    @Override
    public String descarregar() {
        return "Navio descarregando";
    }
}
