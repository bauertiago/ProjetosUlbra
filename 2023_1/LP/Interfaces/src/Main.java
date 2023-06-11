public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5,8);
        System.out.println(retangulo.area());
        System.out.println(retangulo.perimetro());

        Circulo circulo = new Circulo(4);
        System.out.println(circulo.area());
        System.out.println(circulo.perimetro());
    }
}
