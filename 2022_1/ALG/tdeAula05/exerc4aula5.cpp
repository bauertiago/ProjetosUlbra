#include <stdio.h>
int main() {
    float salario, novosal;
    printf("Digite o Salário:\n");
    scanf("%f%*c",&salario);
    novosal=salario+salario*25/100;
    printf("Novo Salário é: %.2f - salario= %.2f", novosal, salario);
    return 0;
}