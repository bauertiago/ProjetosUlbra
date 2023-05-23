public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        System.out.println("Área do Circulo: " + circulo.calcularArea());
        System.out.println("Perímetro do Circulo: " + circulo.calcularPerimetro());
        System.out.println("==============");
        Retangulo retangulo = new Retangulo(10,5);
        System.out.println("Área do Retangulo: " + retangulo.calcularArea());
        System.out.println("Perímetro do Retangulo: " + retangulo.calcularPerimetro());
        System.out.println("==============");
        Triangulo triangulo = new Triangulo(5,5);
        System.out.println("Área do Triangulo: " + triangulo.calcularArea());
        System.out.println("Perímetro do Triangulo: " + triangulo.calcularPerimetro());
    }
}
