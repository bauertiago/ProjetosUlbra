public class Programa {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante("Tiago", 12345, "ADS");
        estudante1.imprimir();
        System.out.println("=====================");
        Estudante estudante2 = new Estudante("Carol", 4321);
        estudante2.imprimir();
        System.out.println("=====================");
        Livro livro1 = new Livro("Algoritmos", "Ramon", 35.90);
        livro1.imprimirLivros();
        System.out.println("=====================");
        Livro livro2 = new Livro("Laboratório de Programação", "Lucas");
        livro2.imprimirLivros();
        System.out.println("=====================");
        Cachorro cachorro1 = new Cachorro("Fred", "vira lata", 18);
        cachorro1.imprimirCachorros();
        System.out.println("=====================");
        Cachorro cachorro2 = new Cachorro("Gaudério", "Cimarrom Uruguaio");
        cachorro2.imprimirCachorros();
    }
}
