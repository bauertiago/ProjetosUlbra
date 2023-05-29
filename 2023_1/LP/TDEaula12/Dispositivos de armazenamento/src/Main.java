public class Main {
    public static void main(String[] args) {
        CartaoDeMemoria cartaoDeMemoria = new CartaoDeMemoria();
        System.out.println(cartaoDeMemoria.gravarDados());
        System.out.println(cartaoDeMemoria.lerDados());
        System.out.println("===========");

        Nuvem nuvem = new Nuvem();
        System.out.println(nuvem.gravarDados());
        System.out.println(nuvem.lerDados());
        System.out.println("===========");

        Pendrive pendrive = new Pendrive();
        System.out.println(pendrive.gravarDados());
        System.out.println(pendrive.lerDados());
    }
}
