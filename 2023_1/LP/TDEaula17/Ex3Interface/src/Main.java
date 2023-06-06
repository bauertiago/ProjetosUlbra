public class Main {
    public static void main(String[] args) {
        Aviao aviao = new Aviao();
        Passaro passaro = new Passaro();
        Superman superman = new Superman();

        aviao.decolar();
        aviao.voar();
        aviao.pousar();
        System.out.println("==========");
        passaro.decolar();
        passaro.voar();
        passaro.pousar();
        System.out.println("==========");
        superman.decolar();
        superman.voar();
        superman.pousar();
    }
}
