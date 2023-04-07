/*Escreva um programa em Java que recebe um número
  inteiro positivo e imprime se ele é um número primo ou
  não. Utilize um loop for para testar se o número é primo.*/
import java.util.Scanner;
public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();
        int x = 0;
        for(int i = 1; i<= num; i++){
            if(num % i == 0){
                x++;
            }
        }if(x == 2){
            System.out.println("O numero" + " " + num + " é primo");
        }else{
            System.out.println("o numero" + " " + num + " não é primo");
        }
    }
}
