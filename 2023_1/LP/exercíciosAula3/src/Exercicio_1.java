/*1. Faça um programa em Java que solicita um número
        inteiro positivo e calcule a soma dos números naturais
        até esse número. Utilize um loop while para realizar o
        cálculo.*/
import java.util.Scanner;
public class Exercicio_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();
        int x = 1;
        int soma = 0;
        while (x <= num){
            soma += x;
            x++;
        }
        System.out.println(soma);
    }
}
