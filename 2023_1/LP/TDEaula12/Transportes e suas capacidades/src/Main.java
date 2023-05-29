public class Main {
    public static void main(String[] args) {
        Caminhao caminhao = new Caminhao();
        System.out.println(caminhao.carregar());
        System.out.println(caminhao.descarregar());
        System.out.println("=========");

        Trem trem = new Trem();
        System.out.println(trem.carregar());
        System.out.println(trem.descarregar());
        System.out.println("=========");

        Navio navio = new Navio();
        System.out.println(navio.carregar());
        System.out.println(navio.descarregar());
    }
}
