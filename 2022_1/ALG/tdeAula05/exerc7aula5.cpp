#include <stdio.h>
int main() {
    float salario, salreceber, imp;
    printf("Digite o salário:\n");
    scanf("%f%*c",&salario);
    imp= salario*10/100;
    printf("imposto: %.2f", imp);
    salreceber=salario+50-imp;
    printf("Salário a receber: %.2f - salario=%.2f", salreceber, salario);
    return 0; 
}