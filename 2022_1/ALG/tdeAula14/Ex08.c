// Crie um programa que lê 6 valores inteiros e,
// em seguida, mostre na tela os valores lidos na ordem inversa.
#include <stdio.h>
#include <windows.h>
int main()
{
    UINT CPAGE_UTF8 = 65001;
    SetConsoleOutputCP(CPAGE_UTF8);
    int valores[6];
    int i, num;
    i = 0;
    do
    {
        printf("%d - Digite um número\n", i);
        scanf("%d%*c", &num);
        valores[i] = num;
        i++;

    } while (i < 6);
    for (i = 5; i >= 0; i--)
    {
        printf("%d, ", valores[i]);
    }
}