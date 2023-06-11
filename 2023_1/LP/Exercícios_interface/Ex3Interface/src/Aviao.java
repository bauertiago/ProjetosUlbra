public class Aviao implements Voador{
    @Override
    public void decolar() {
        System.out.println("Avião decolando");
    }

    @Override
    public void voar() {
        System.out.println("Avião voando");
    }

    @Override
    public void pousar() {
        System.out.println("Avião pousando");
    }
}
