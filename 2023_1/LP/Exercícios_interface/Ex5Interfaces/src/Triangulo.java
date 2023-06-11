public class Triangulo implements FormaGeometrica{
    double base;
    double altura;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calcularArea() {
        return (base * altura)/2;
    }

    @Override
    public double calcularPerimetro() {
        return base + (altura * 2);
    }
}
