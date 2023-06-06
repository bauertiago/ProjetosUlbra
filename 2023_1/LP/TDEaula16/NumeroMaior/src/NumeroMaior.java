public class NumeroMaior {
    public static void main(String[] args) {
        int[] valores = {10, 1, 5, 100, 55};
        int maior = valores[0];

        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > maior) {
                maior = valores[i];
            }
        }
        System.out.println("O número maior é: " + maior);
    }
}
