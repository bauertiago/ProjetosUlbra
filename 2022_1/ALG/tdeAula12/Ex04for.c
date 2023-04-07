#include <stdio.h>
#include <windows.h>

int main(){
     UINT CPAGE_UTF8 = 65001;
    SetConsoleOutputCP(CPAGE_UTF8);
    
    int nota, soma, media;
    soma=0;
    for (int i = 0; i < 10; i++)
    {
        printf("Digite a nota:\n");
        scanf("%d%*c",&nota);
        soma=soma+nota;
    }
    media=soma/10;
    printf("A média dos 10 alunos é:%d\n",media);
    return 0;
}