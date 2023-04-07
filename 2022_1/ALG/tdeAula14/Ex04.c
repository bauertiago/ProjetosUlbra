/*Faça um programa que leia um vetor de 8 posições e, 
em seguida, leia também dois valores X e Y quaisquer correspondentes a duas posições no vetor. 
Ao final, seu programa deverá escrever a soma dos valores encontrados nas respectivas posições  X e Y .*/
#include <stdio.h>
#include <windows.h>
int main(){
    UINT CPAGE_UTF8 = 65001;
    SetConsoleOutputCP(CPAGE_UTF8);
    int valor[8];
    int x,y,i,soma=0;
    valor[2]=x;
    valor[4]=y;
    for ( i = 0; i < 8; i++){
        printf("%d - digite um valor:\n",i+1);
        scanf("%d%*c",&valor[i]);
    }
    for(i = 0; i < 1;i++){
        printf("%d - digite um valor para a posição 2:\n",i+1);
        scanf("%d%*c",&valor[2]);
        printf("%d - digite um valor para a posicão 4:\n",i+2);
        scanf("%d%*c",&valor[4]);
    }
    soma=valor[2]+valor[4];
    printf("A soma da posição 2 e posição 4 é:%d\n",soma);
}