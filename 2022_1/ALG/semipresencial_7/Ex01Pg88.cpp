#include <stdio.h>
#include <stdlib.h>
#include <windows.h>
#define MEDIA 7

int main(){
    UINT CPAGE_UTF8 = 65001;
    SetConsoleOutputCP(CPAGE_UTF8);
    float nota1, nota2, nota3, nota4, mediaAritimetica;
    printf("Digite a primeira nota:");
    scanf("%f%*c", &nota1);
    printf("Digite a segunda nota:");
    scanf("%f%*c", &nota2);
    printf("Digite a terceira nota:");
    scanf("%f%*c", &nota3);
    printf("Digite a quarta nota:");
    scanf("%f%*c", &nota4);

    mediaAritimetica = (nota1+nota2+nota3+nota4)/4;
    printf("A média das notas do aluno é:%.2f\n",mediaAritimetica);

    if (mediaAritimetica >= MEDIA) {
        printf("Aprovado");
    }else{
        printf("Reprovado");
    }  
    return 0;
}