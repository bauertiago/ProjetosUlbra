#include <stdio.h>
int main() {
    float nota1,nota2,nota3,media;
    printf("Digite nota1\n");
    scanf("%f%*c",&nota1);
    printf("Digite nota2\n");
    scanf("%f%*c",&nota2);
    printf("Digite nota3\n");
    scanf("%f%*c",&nota3);
    media=(nota1+nota2+nota3)/3;
    printf("Média é: %.2f - nota1=%.2f - nota2=%.2f - nota3=%.2f",media,nota1,nota2,nota3);
    return 0;
}