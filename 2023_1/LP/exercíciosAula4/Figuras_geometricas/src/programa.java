public class programa {
    public static void main(String[] args) {
        //criando/instanciando o objeto triangulo da Classe Triangulo
        Triangulo triangulo = new Triangulo();
        //definindo os valores para base e altura
        triangulo.base = 5;
        triangulo.altura = 3;
        //calculando a área do triangulo com o método calcularArea da classe Triangulo
        double area = triangulo.calcularArea();

        //criando/instanciando o objeto quadrado da Classe Quadrado
        Quadrado quadrado = new Quadrado();
        //definindo o valor de lado
        quadrado.lado = 4;
        //calculando a área do quadrado com o método calcularArea da classe Quadrado
        double areaQ = quadrado.calcularArea();

        //criando/instanciando o objeto c da classe Circunferencia
        Circunferencia c = new Circunferencia();
        //definindo o valor de raio
        c.raio = 5;
        //calculando a área de c com o método calcularArea da classe Circunferência
        double areaC = c.calcularArea();

        //criando/instanciando o objeto trapezio da classe Trapezio
        Trapezio trapezio = new Trapezio();
        //definindo os valores da baseMaior, baseMenor e altura
        trapezio.baseMaior = 9;
        trapezio.baseMenor = 5;
        trapezio.altura = 3;
        //calculando a área do trapézio com o método calcularArea da classe Trapézio
        double areaT = trapezio.calcularArea();

        //imprimindo o resultado
        System.out.println("A área do triangulo é: " + area);
        System.out.println("A área do quadrado é: " + areaQ);
        System.out.println("A área da circunferência é: " + areaC);
        System.out.println("A área do trapezio é: " + areaT);

    }
}
