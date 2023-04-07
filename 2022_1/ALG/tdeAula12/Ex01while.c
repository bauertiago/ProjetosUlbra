#include <stdio.h>
#include <windows.h>

int main()
{
    UINT CPAGE_UTF8 = 65001;
    SetConsoleOutputCP(CPAGE_UTF8);

    int numero, soma;
    int i = 0;
    soma = 0;
    while (i < 10){
        printf("Digite um número:\n");
        scanf("%d%*c", &numero);
        soma = soma + numero;
        i++;
    }
    printf("A soma dos numeros é:%.d\n", soma);
    return 0;
}