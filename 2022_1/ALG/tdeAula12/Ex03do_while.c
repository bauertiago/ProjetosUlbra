#include <stdio.h>

int main(){
    
    int nInicial, nFinal;
    int i=nInicial;
    printf("Digite número incial:\n");
    scanf("%d%*c", &nInicial);
    printf("Digite número final:\n");
    scanf("%d%*c", &nFinal);
    do{        
        if (i%2 != 0)
        printf("número impar %d\n",i);
        i++;
    }        
    while (i<=nFinal);
    return 0;
}