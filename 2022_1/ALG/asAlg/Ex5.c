/*Faça um programa que receba do usuário dois vetores, 
A e B, com 10 números inteiros cada. 
Crie um novo vetor denominado C calculando C = A - B. 
Mostre na tela os dados do vetor C*/

#include <stdio.h>
#include <stdlib.h>

int main(){
    int vetA[2],vetB[2],vetC;
    int i;
    
    for ( i = 0; i < 2; i++){
        printf("[A]Digite um numero:%d\n ",i+1);
        scanf("%d%*c",&vetA[i]);
    }
    
    for ( i = 0; i < 2; i++){
        printf("[B]Digite um numero:%d\n ",i+1);
        scanf("%d%*c",&vetB[i]);
    }

    for ( i = 0; i < 2; i++){
        vetC= (vetA[i]-vetB[i]);
        printf("Vetor c:[%d]=%d - %d = %d\n ",i,vetA[i],vetB[i],vetC);
    }
}