#include <stdio.h>
int main(){
    int num[6];
    int cPar, cImpar;
    int i =0;
    cPar=0;
    cImpar=0;
    do{
        printf("%d - Digite um número:\n", i);
        scanf("%d%*c", &num[i]);
        if(num[i]==0){
            printf("Número nulo\n");
        }
        else if(num[i]%2==0){
        printf("Número par\n");
        cPar++;
        
    }else{
        printf("Numero impar\n");
        cImpar++;
       
    }
    i++;
    }while(i<6);
    printf("Foram digitados %d pares\n",cPar); 
    printf("Foram digitados %d impares\n",cImpar);
}