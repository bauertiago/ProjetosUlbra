#include <stdio.h>
#include <windows.h>

int main() {
    UINT CPAGE_UTF8 = 65001;
    SetConsoleOutputCP(CPAGE_UTF8);
    float nota1, nota2, media;
    printf("Digite a nota 1:\n");
    scanf("%f%*c",&nota1);
    printf("Digite a nota 2:\n");
    scanf("%f%*c",&nota2);
    media=(nota1+nota2)/2;
    printf("A média é: %.2f\n",media);
    if (media<4){
        printf("Reprovado");
    }else if((media>=4)&&(media<7)){
        printf("Exame");
    }else{
        printf("Aprovado");
    }
    return 0;
}