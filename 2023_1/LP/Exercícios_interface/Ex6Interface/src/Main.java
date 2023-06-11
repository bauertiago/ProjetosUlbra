public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();
        Elefante elefante = new Elefante();

        gato.comer();
        gato.dormir();
        System.out.println("==============");
        cachorro.comer();
        cachorro.dormir();
        System.out.println("==============");
        elefante.comer();
        elefante.dormir();
    }
}
