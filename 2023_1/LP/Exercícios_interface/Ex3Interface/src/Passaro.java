public class Passaro implements Voador{
    @Override
    public void decolar() {
        System.out.println("Pássaro decolando");
    }

    @Override
    public void voar() {
        System.out.println("Pássaro voando");
    }

    @Override
    public void pousar() {
        System.out.println("Pássaro pousando");
    }
}
