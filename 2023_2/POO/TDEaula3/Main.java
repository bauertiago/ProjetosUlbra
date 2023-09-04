import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // lista de numeros para calcular
        ArrayList<Double> listaSoma = new ArrayList<>();
        listaSoma.add(30.0);
        listaSoma.add(20.0);

        ArrayList<Double> listaSubtracao = new ArrayList<>();
        listaSubtracao.add(10.0);
        listaSubtracao.add(30.0);

        ArrayList<Double> listaMultiplicacao = new ArrayList<>();
        listaMultiplicacao.add(4.0);
        listaMultiplicacao.add(10.0);

        ArrayList<Double> listaDivisao = new ArrayList<>();
        listaDivisao.add(10.0);
        listaDivisao.add(2.0);

        // Instanciando objeto operador
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();

        // instanciando objeto calculadora
        CalculadoraBasica calcBasica = new CalculadoraBasica();

        calcBasica.calcular(soma, listaSubtracao);
        System.out.println(calcBasica.getResultado());

        calcBasica.calcular(subtracao, listaSubtracao);
        System.out.println(calcBasica.getResultado());

        calcBasica.calcular(multiplicacao, listaMultiplicacao);
        System.out.println(calcBasica.getResultado());

        calcBasica.calcular(divisao, listaDivisao);
        System.out.println(calcBasica.getResultado());
    }
}
