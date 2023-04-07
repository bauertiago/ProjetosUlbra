#include <stdio.h>
int main(){
    int numero=9,i;
    for (i = 1; i <= 10; i++)
    {
        printf("| %d x %d = %d |\n",i,numero,(i*numero));
    }
    return 0;
}