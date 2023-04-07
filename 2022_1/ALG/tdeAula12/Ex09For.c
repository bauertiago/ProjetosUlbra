#include <stdio.h>
int main(){
    int numero,i;
    printf("Digite um número da tabuada:\n");
    scanf("%d%*c",&numero);
    for (i = 1; i <= 10; i++)
    {
        printf("| %d x %d = %d |\n",i,numero,(i*numero));
    }
    return 0;
}