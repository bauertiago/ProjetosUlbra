public class Atleta implements Andador,Corredor{
    @Override
    public void andar() {
        System.out.println("Atleta andando");
    }

    @Override
    public void correr() {
        System.out.println("Atleta correndo");
    }
}
