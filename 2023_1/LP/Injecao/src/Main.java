public class Main {
    public static void main(String[] args) {
        Diesel diesel = new Diesel();
        Gasolina gasolina = new Gasolina();

        Motor motorGasolina = new Motor(gasolina);
        motorGasolina.acelerar();

        Motor motorDiesel = new Motor(diesel);
        motorDiesel.acelerar();
    }
}
