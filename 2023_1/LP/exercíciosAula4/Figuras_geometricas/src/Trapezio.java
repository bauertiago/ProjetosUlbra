public class Trapezio {
    double baseMaior = 9;
    double baseMenor = 5;
    double altura = 3;

    double calcularArea() {
        double area = ((baseMaior + baseMenor) / 2) * altura;
        return area;
    }
}
