#include <stdio.h>
int main() {
    float nota1, nota2, nota3, peso1, peso2, peso3, media;
    printf("Digite Nota1\n");
    scanf("%f%*c",&nota1);
    printf("Digite Nota2\n");
    scanf("%f%*c",&nota2);
    printf("Digite Nota3\n");
    scanf("%f%*c",&nota3);
    printf("Digite Peso1\n");
    scanf("%f%*c",&peso1);
    printf("Digite Peso2\n");
    scanf("%f%*c",&peso2);
    printf("Digite Peso3\n");
    scanf("%f%*c",&peso3);
    media=(nota1*peso1+nota2*peso2+nota3*peso3)/(peso1+peso2+peso3);
    printf("Media é: %.2f - nota1=%.2f - nota2=%.2f - nota3=%.2f - peso1=%.2f - peso2=%.2f - peso3=%.2f",media,nota1,nota2,nota3,peso1,peso2,peso3);
    return 0;
}