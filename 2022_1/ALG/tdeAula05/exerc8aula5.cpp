#include <stdio.h>
int main() {
    float dep, taxa, rend, total;
    printf("Digite o valor do depósito:\n");
    scanf("%f%*c",&dep);
    printf("Digite a taxa de juros:\n");
    scanf("%f%*c",&taxa);
    rend= dep*taxa/100;
    total= dep+rend;
    printf("rendimento: %.2f", rend);
    printf("total depois do rendimento: %.2f", total);
    return 0;
}