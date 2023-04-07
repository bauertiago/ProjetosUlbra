#include <stdio.h>
#include <windows.h>
int main(){
    UINT CPAGE_UTF8 = 65001;
    SetConsoleOutputCP(CPAGE_UTF8);

    float nota_trab, aval_sem, exame, media;
    printf("Digite a nota do trabalho de laboratório:\n");
    scanf("%f%*c",&nota_trab);
    printf("Digite a nota da avaliação semestral:\n");
    scanf("%f%*c",&aval_sem);
    printf("Digite a nota do exame final:\n");
    scanf("%f%*c",&exame);
    media=(nota_trab*2+aval_sem*3+exame*5)/10;
    printf("Média ponderada:%.2f\n",media);
    
    if (media>=8 && media<=10){
        printf("Obteve conceito A");
    }else if (media>=7 && media<8){
        printf("Obteve conceito B");
    }else if (media>=6 && media<7){
        printf("Obteve conceito C");
    }else if (media>=5 && media<6){
        printf("Obteve conceito D");
    }else if (media>=0 && media<5){
        printf("Obteve conceito E");
    }
    return 0;
}