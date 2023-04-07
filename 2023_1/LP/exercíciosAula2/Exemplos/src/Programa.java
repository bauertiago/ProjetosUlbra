import java.sql.SQLOutput;

public class Programa {
               public static void main(String[] args) {
                   //notas do aluno
                    double nota1 = 8.5;
                    double nota2 = 7.5;
                    double nota3 = 6.0;
                    //peso das provas
                    int peso1 = 3;
                    int peso2 = 2;
                    int peso3 = 5;
                    //calculo parcial das notas multiplicando a nota pelo peso
                    double parcial1 = nota1*peso1;
                    double parcial2 = nota2*peso2;
                    double parcial3 = nota3*peso3;
                    //calculo da média
                   double media = (parcial1 + parcial2 + parcial3) / (peso1 + peso2 + peso3);
                   System.out.println(media);
               }
}
