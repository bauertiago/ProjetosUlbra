#include <stdio.h>
int main() {
    float sal, salreceber, gratificacao, imp;
    printf("Digite o Salário\n");
    scanf("%f%*c", &sal);
    gratificacao= sal*5/100;
    imp= sal * 7/100;
    salreceber= sal + gratificacao - imp;
    printf("Salário a receber:%.2f - Salário atual=%.2f - Gratificação de 5=%.2f - Imposto de 7=%.2f", salreceber, sal, gratificacao, imp);
    return 0;
}