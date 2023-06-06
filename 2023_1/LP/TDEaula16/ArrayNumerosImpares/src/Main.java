public class Main {
    public static void main(String[] args) {
        int[] numerosImpares = new int[10];
        int count = 0;

        for (int i = 1; count < 10; i++) {
            if (i % 2 == 1) {
                numerosImpares[count] = i;
                count++;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(numerosImpares[i]);
        }

        System.out.println("========Outra Forma========");
        int[] numeros = new int[10];
        for (int x = 0; x < numeros.length; x++) {
            numeros[x] = x * 2 + 1;
        }
        for (int x = 0; x < numeros.length; x++) {
            System.out.println(numeros[x]);
        }
    }
}
