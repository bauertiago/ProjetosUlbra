/*Escreva um programa em Java que solicita um número
  inteiro positivo e imprime todos os números pares entre 1
  e esse número. Utilize um loop while para realizar a
  impressão.*/
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = input.nextInt();
        int x = 1;
        while (x <= num){
            if(x % 2 == 0){
                System.out.println(x);
            }
            x++;
        }
    }


}
