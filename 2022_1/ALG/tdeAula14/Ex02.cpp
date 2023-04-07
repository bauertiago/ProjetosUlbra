//Crie um programa que lê 6 valores inteiros e, 
//em seguida, mostre na tela os valores lidos.
#include <stdio.h>
#include <windows.h>
int main(){
    UINT CPAGE_UTF8 = 65001;
    SetConsoleOutputCP(CPAGE_UTF8);
    int valor[5];
    int i;
    for(i=0; i<6; i++){
        printf("digite um valor:\n");
        scanf("%d%*c", &valor[i]);
    }
    for ( i = 0; i < 6; i++)    {
        printf("valores digitados:%d\n",valor[i]);
    }
    
}