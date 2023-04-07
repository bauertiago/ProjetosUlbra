#include <stdio.h>
int main() {
    float base, altura, area;
    printf("Digite o valor da base:\n");
    scanf("%f%*c",&base);
    printf("Digite o valor da altura:\n");
    scanf("%f%*c",&altura);
    area= (base*altura)/2;
    printf("A area do triangulo é: %.2f", area);
    return 0;
}