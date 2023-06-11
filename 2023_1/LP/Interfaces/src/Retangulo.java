public class Retangulo implements FiguraGeometrica{
    public double altura;
    public double largura;

    public Retangulo(double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double area() {
        return altura * largura;
    }

    @Override
    public double perimetro() {
        return (altura + largura)* 2;
    }
}
