#include <stdio.h>
#include <windows.h>

int main(){
     UINT CPAGE_UTF8 = 65001;
    SetConsoleOutputCP(CPAGE_UTF8);
    
    int numero, soma;
    int i=0;
    soma=0;
    do{
        printf("Dígite um número:\n",i+1);
        scanf("%d%*c",&numero);
        soma=soma+numero;
        i++;
    }while(i<10);
    printf("a soma dos 10 numeros é:%.d\n",soma);
    return 0;
}