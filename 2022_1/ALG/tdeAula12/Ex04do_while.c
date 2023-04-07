#include <stdio.h>
#include <windows.h>

int main(){
     UINT CPAGE_UTF8 = 65001;
    SetConsoleOutputCP(CPAGE_UTF8);
    
    int nota, soma, media;
    int i=0;
    soma=0;
    do{
        printf("Digite a nota:\n",i+1);
        scanf("%d%*c",&nota);
        soma=soma+nota;
        media=soma/10;
        i++;
    }while(i<10);
    printf("A média é:%.d\n",media);
    return 0;
}