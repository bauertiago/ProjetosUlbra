#include <stdio.h>
#include <windows.h>
#define preco 260
int main() {
    UINT CPAGE_UTF8 = 65001;
    SetConsoleOutputCP(CPAGE_UTF8);

    float quant, soma;
    printf("Digite a quantidade de caçambas:\n");
    scanf("%f%*c", &quant);
    soma = quant * preco;
    printf("O valor Total do aterro é:%.2f reais\n",soma);

    return 0;
}