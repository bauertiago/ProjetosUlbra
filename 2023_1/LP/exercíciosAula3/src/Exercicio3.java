/*Escreva um programa em Java que solicita um número
  inteiro positivo e imprime a tabuada desse número até o
  número 10. Utilize um loop for para realizar a impressão.*/
import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 10: ");
        int num = input.nextInt();

        for (int i = 0; i <= 10; i++){
            System.out.println(num + "x" + i + "=" + (num*i));
        }
    }
}
