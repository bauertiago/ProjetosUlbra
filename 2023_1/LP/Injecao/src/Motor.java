public class Motor {
    private Combustivel combustivel;
    public Motor(Combustivel combustivel){
        this.combustivel = combustivel;
    }
    public void acelerar(){
        combustivel.queimar();
    }
}
