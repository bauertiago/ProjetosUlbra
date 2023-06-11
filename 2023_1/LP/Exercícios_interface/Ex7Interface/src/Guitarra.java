public class Guitarra implements Musical{
    @Override
    public void tocar() {
        System.out.println("Tocar guitarra");
    }

    @Override
    public void pausar() {
        System.out.println("Pause guitarra");
    }

    @Override
    public void parar() {
        System.out.println("Parar guitarra");
    }
}
