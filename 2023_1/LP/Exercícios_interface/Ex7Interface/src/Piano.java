public class Piano implements Musical{
    @Override
    public void tocar() {
        System.out.println("Tocar Piano");
    }

    @Override
    public void pausar() {
        System.out.println("Pause piano");
    }

    @Override
    public void parar() {
        System.out.println("Parar piano");
    }
}
