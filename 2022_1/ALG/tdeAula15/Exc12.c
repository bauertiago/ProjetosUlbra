#include <stdio.h>
#include <windows.h>
int main (){
     UINT CPAGE_UTF8 = 65001;
    SetConsoleOutputCP(CPAGE_UTF8);

    int vetor[5];
    int total=0;
    for(int i=0; i<5; i++){
        printf("Digite o %dº number\n", i+1);
        scanf("%d%*c",&vetor[i]);
        total+=vetor[i];
    }
    for(int i = 0; i<5; i++){
        if(i!=0)
    }
}