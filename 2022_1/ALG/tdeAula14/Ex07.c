/*Escreva um programa que leia 10 números inteiros e os armazene em um vetor. 
Imprima  o vetor, o maior elemento e a posição em que ele se encontra.*/
#include <stdio.h>
#include <windows.h>
int main(){
    UINT CPAGE_UTF8 = 65001;
    SetConsoleOutputCP(CPAGE_UTF8);
    int num[10];
    int i;
    int maior;
    int posicao;
    for(i=0;i<10;i++){
        printf("%d - Digite um número:\n", i);
        scanf("%d%*c", &num[i]);
    }
    maior=num[0];
    for(i=0;i<10;i++){
        if(maior<num[i]){
            maior=num[i];
            posicao=i;
        }
    }
    for(i=0; i<10; i++){
        printf("%dº posição, numero:%d\n",i ,num[i]);
    }
    printf("Maior número é [%d] na posição [%d] ", maior, posicao);
}