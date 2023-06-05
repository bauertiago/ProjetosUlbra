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
    }
}
