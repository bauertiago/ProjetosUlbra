#include <stdio.h>
int main(){
    int numero;
    int i=0;
    do
    {
        printf("%d - Digite um número:\n", i+1);
        scanf("%d%*c",&numero);
        if(numero<=0){
            printf("número nulo\n"); 
            break;           
        }else if(numero%2==0){
           printf("número par\n"); 
            }else{
                printf("número impar\n");
            }
            i++;        
    } while (numero>0);
    return 0;    
}