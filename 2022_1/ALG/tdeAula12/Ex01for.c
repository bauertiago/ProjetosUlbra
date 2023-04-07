#include <stdio.h>
#include <windows.h>

int main(){
     UINT CPAGE_UTF8 = 65001;
    SetConsoleOutputCP(CPAGE_UTF8);
    
    int numero, soma, media;
    soma=0;
    for (int i = 0; i < 10; i++)
    {
        printf("Digite um número:\n");
        scanf("%d%*c",&numero);
        soma=soma+numero;
    }
    media=soma/10;
    printf("A soma dos 10 numeros é:%d\n",soma);
    printf("A média dos 10 numeros é:%d\n",media);
    return 0;
}