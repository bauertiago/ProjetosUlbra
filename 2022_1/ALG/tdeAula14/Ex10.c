//Faça um programa para ler a nota da prova de 15 alunos 
//e armazene num vetor, calcule e imprima a média geral.
#include <stdio.h>

int main(){
  
    float soma, media;
    soma=0;
    float notas[15];
    int i;
    i=0;

    do
    {
        printf("Digite a nota %dº posição vetor\n", i + 1);
        scanf("%f%*c", &notas[i]);
        i++;
    } while (i<15);

    for(i=0;i<=15;i++){
        soma+=notas[i];
    }
    media=soma/15;
    printf("A soma é: %f", soma);
    printf("A média é: %f", media);
}