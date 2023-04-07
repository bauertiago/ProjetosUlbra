//Leia um vetor de 10 posições. 
//Contar e escrever quantos valores pares ele possui.
#include <stdio.h>
#include <windows.h>
int main(){
    UINT CPAGE_UTF8 = 65001;
    SetConsoleOutputCP(CPAGE_UTF8);
    int num[10], cPar=0;
    int i;
    for(i=0;i<10;i++){
        printf("%d - Digite um número:\n",i+1);
        scanf("%d%*c", &num[i]);
            
    }  for(int i=0;i<10;i++){
        if(num[i]%2==0){
        cPar=cPar+1;
    }
}
    printf("Foram digitados %d pares",cPar);
}