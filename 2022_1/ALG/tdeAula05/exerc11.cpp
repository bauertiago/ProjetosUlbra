#include <stdio.h>
#include <math.h>

int main() {
    float numero, quadrado, cubo, raiz2, raiz3;
    printf("Digite um número positivo e maior que zero:\n");
    scanf("%f%*c",&numero);
    quadrado=pow(numero,2);
    cubo=pow(numero,3);
    raiz2=sqrt(numero);
    raiz3=cbrt(numero);
    printf("Número digitado ao quadrado:%.f\n", quadrado);
    printf("Número digitado ao cubo:%.f\n", cubo);
    printf("Raiz quadrada do número digitado:%.2f\n",raiz2);
    printf("Raiz cúbica do número digitado:%.2f\n",raiz3);
    return 0;
}