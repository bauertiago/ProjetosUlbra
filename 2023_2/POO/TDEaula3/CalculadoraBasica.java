import java.util.ArrayList;

public class CalculadoraBasica extends Calculadora {

    @Override
    void calcular(Operador operador, ArrayList<Double> lista) {
        setResultado(operador.calcular(lista));
    }
}
