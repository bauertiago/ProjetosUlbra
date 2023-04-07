#include <stdio.h>
int main() {
    float sal, perc, aumento, novosal;
    printf("Digite o salário\n");
    scanf("%f%*c",&sal);
    printf("Digito o percentual de aumento\n");
    scanf("%f%*c",&perc);
    aumento=sal*perc/100;
    printf("O aumento é de:%.2f",aumento);
    novosal=sal+aumento;
    printf("O novo salário é:%.2f - Salário atual=%.2f - Percentual de aumento=%.2f - Aumento=%.2f",novosal, sal, perc, aumento);
    return 0;
}