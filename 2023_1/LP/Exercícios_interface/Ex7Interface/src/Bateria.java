public class Bateria implements Musical{
    @Override
    public void tocar() {
        System.out.println("Tocar bateria");
    }

    @Override
    public void pausar() {
        System.out.println("Pause bateria");
    }

    @Override
    public void parar() {
        System.out.println("Parar bateria");
    }
}
