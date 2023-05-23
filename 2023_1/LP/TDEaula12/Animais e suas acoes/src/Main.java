public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        System.out.println(cachorro.comer());
        System.out.println(cachorro.dormir());
        System.out.println(cachorro.mover());
        System.out.println("==========");
        Gato gato = new Gato();
        System.out.println(gato.comer());
        System.out.println(gato.dormir());
        System.out.println(gato.mover());
        System.out.println("===========");
        Peixe peixe = new Peixe();
        System.out.println(peixe.comer());
        System.out.println(peixe.dormir());
        System.out.println(peixe.mover());
    }
}
