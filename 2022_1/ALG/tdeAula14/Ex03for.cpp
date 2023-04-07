/*Ler um conjunto de números reais, 
armazenando-o em vetor e calcular o quadrado das componentes deste vetor, 
armazenando o resultado em outro vetor. 
Os conjuntos têm 10 elementos cada. Imprimir todos os conjuntos.*/
#include <stdio.h>
#include <math.h>
#include <windows.h>
int main()
{
    UINT CPAGE_UTF8 = 65001;
    SetConsoleOutputCP(CPAGE_UTF8);
    int numero[10];
    int i;
    int quadrado[10];
    
    for(i=0; i<10; i++)
    {
        printf("%d - digite um número:\n",i);
        scanf("%d%*c", &numero[i]);
        quadrado[i] = (pow(numero[i],2));
        
    }
    for (i = 0; i < 10; i++)
    {
        printf("%d o quadrado do número %.d é:%.d\n", i, numero[i], quadrado[i]);
    }
}