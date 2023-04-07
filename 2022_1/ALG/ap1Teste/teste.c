#include <math.h>
#include <stdio.h> // necessário p/ as funções rand() e srand()
#include <string.h>   //necessário p/ função time()

int main(){

    int vetor[10],i=0, numero, cont,posicao=0;

    while (posicao < 10){

        scanf("%d",&numero);

        if(posicao == 0){
           vetor[posicao]= numero; 
           printf("%d\n", vetor[i]);
        posicao++;
        }       
    
    else{

    for ( cont = 0; (cont < posicao)&&(vetor[cont]!=numero);
    cont++);
            if(cont>=posicao){
            vetor[posicao]=numero;
            printf("%d\n",vetor[posicao]);
            posicao++;
        }
        }
    }
    return 0;
}