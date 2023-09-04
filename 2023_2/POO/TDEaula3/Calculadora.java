import java.util.ArrayList;

public abstract class Calculadora {
    private double resultado;

    abstract void calcular(Operador operador, ArrayList<Double> lista);

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

}
