//Faça um programa que leia a matricula,
//o nome e as três notas de 10 alunos
//e indique para cada aluno, se ele foi aprovado ou não,
//considere a média 7.
#include <stdio.h>

int main(){
    int matricula;
    char nome[10];
    float nota1, nota2, nota3, media;
    int i;
    int TAMANHO(10);

    for (i= 0; i < TAMANHO; i++){
    printf("Digite a matricula:\n");
    scanf("%d%*c",&matricula);
    printf("Digite o nome:\n");
    scanf("%s%*c",&nome);
    printf("Digite a nota:\n");
    scanf("%f%*c",&nota1);
    printf("Digite a nota:\n");
    scanf("%f%*c",&nota2);
    printf("Digite a nota:\n");
    scanf("%f%*c",&nota3);
    media=(nota1+nota2+nota3)/3;
        
    if(media>=7){
        printf("Parabéns! %s Você esta aprovado(a) %.2f\n", nome, media);
    }else{
        printf("%s Você foi reprovado(a) %.2f\n",nome,media);
    }
}

}