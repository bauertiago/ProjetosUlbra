#include <stdio.h>

int main() {
    int nInicial, nFinal;
    int i=nInicial;
    printf("Digite número inicial:\n");
    scanf("%d%*c",&nInicial);
    printf("Digite número final:\n");
    scanf("%d%*c",&nFinal);
    while (i<=nFinal){
        if (i%2 != 0){
            printf("número impar %d\n",i);
        }
        i++;
    }
    return 0;
}