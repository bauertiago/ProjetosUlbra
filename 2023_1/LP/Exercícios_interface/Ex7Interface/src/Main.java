public class Main {
    public static void main(String[] args) {
        Guitarra guitarra = new Guitarra();
        Piano piano = new Piano();
        Bateria bateria = new Bateria();

        guitarra.tocar();
        guitarra.pausar();
        guitarra.parar();
        System.out.println("=============");
        piano.tocar();
        piano.pausar();
        piano.parar();
        System.out.println("=============");
        bateria.tocar();
        bateria.pausar();
        bateria.parar();
    }
}
