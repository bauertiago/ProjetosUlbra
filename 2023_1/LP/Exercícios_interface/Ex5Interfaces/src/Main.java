public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(10,5);
        Circulo circulo = new Circulo(10);
        Triangulo triangulo = new Triangulo(5,4);

        System.out.println("Área do retangulo: " + retangulo.calcularArea());
        System.out.println("Perímetro do retangulo " + retangulo.calcularPerimetro());
        System.out.println("=============");
        System.out.println("Área do circulo: " + circulo.calcularArea());
        System.out.println("Perímetro do circulo " + circulo.calcularPerimetro());
        System.out.println("=============");
        System.out.println("Área do triangulo: " + triangulo.calcularArea());
        System.out.println("Perímetro do triangulo " + triangulo.calcularPerimetro());
        System.out.println("=============");
    }
}
