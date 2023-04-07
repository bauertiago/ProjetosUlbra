#include <stdio.h>
int main(){
    int numero;
    int i=0;
    for (i = 0; i < 5; i++)
    {
        printf("Digite o número:\n");
    scanf("%d%*c",&numero);
    if (numero > 0){
        printf("número positivo\n");
    }else if(numero < 0){
        printf("número negativo\n");
    }else{
        printf("número nulo\n");
    }    
}
return 0;
}