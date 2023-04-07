#include <stdio.h>
int main(){
    int numero;
    
    do
    {
        printf("Digite um numero:\n");
    scanf("%d%*c",&numero);
    if(numero>0){        
    printf("numero Positivo\n");
    }else if(numero<0){
        printf("numero Negativo\n");
    }else{
        break;
    }
    } while (numero!=0);   
}