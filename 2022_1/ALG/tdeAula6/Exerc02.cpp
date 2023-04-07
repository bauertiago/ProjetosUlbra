#include <stdio.h>
#include <windows.h>
int main(){
    UINT CPAGE_UTF8 = 65001;
    SetConsoleOutputCP(CPAGE_UTF8);
    
    float nota1, nota2, nota3, media, nota_exame;
    printf("Digite a Primeira nota:\n");
    scanf("%f%*c",&nota1);
    printf("Digite a segunda nota:\n");
    scanf("%f%*c",&nota2);
    printf("Digite a terceira nota:\n");
    scanf("%f%*c",&nota3);
    media=(nota1+nota2+nota3)/3;
    printf("Média é:%.2f\n",media);
    if (media >=7 && media <=10){
       printf("Aprovado\n");
    }else if(media >=3 && media <7){
        printf("Você ficou em Exame\n");
        nota_exame=12 - media;
        printf("Você deve tirar:%.2f para ser aprovado", nota_exame);
    }else if (media >=0 && media <3){
        printf("Reprovado");
    }else{
        printf("DADOS INVALIDOS!!!");
    }
    return 0;
}