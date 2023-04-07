//faça um programa que leia 
#include <stdio.h>
int main(){
    int numero, cPar,cImpar, aPar, aImpar;
    int cont;
    cont=0;
    cPar=0;
    cImpar=0;
    aPar=0;
    aImpar=0;
    do
    {
        printf("%d - Digite um número:\n", cont+1);
    scanf("%d%*c",&numero);
    if(numero==0){
        printf("Número nulo\n");
    }
    else if(numero%2==0){
        printf("Número par\n");
        cPar++;
        aPar+=numero;
    }else{
        printf("Numero impar\n");
        cImpar++;
        aImpar+=numero;
    }
    cont++;
    } while (cont<10);
    printf("Foram digitados %d pares\n",cPar); 
    printf("Foram digitados %d impares\n",cImpar); 
    printf("O acumulado de pares é:%d",aPar);
    printf("O acumulado de impares é:%d",aImpar); 
    return 0; 
}