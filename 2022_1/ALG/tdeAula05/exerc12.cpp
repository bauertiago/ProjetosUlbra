#include <stdio.h>
#include <math.h>

int main () {
    float numero1, numero2, elevado1, elevado2;
    printf("Digite dois números maiores que zero\n");
    printf("Digite um número:\n");
    scanf("%f%*c",&numero1);
    printf("Digite outro número:\n");
    scanf("%f%*c",&numero2);
    elevado1=pow(numero1,numero2);
    elevado2=pow(numero2,numero1);
    printf("Resultado do primeiro número elevado ao segundo:%.2f\n",elevado1);
    printf("Resultado do segundo número elevado ao primeiro:%.2f\n",elevado2);
    return 0;
}