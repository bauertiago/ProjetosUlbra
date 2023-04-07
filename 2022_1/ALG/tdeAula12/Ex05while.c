#include <stdio.h>

int main()
{
    int n, i=1, acumulador=0;
        printf("Digite um valor para N:\n");
        scanf("%d%*c", &n);
    while (i<=n) {
        acumulador=i+acumulador;
        i++;
    }printf("a soma dos números de 1 a N é:%.d\n",acumulador);
    return 0;
}