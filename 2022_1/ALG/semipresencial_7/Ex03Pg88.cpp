#include <stdio.h>
#include <windows.h>
int main(){
    UINT CPAGE_UTF8 = 65001;
    SetConsoleOutputCP(CPAGE_UTF8);
    float n1, n2;
    printf("Digite um número:");
    scanf("%f%*c",&n1);
    printf("Digite outro número:");
    scanf("%f%*c",&n2);
    if(n1 < n2){
        printf("o menor numero é:%.f\n",n1);
    }else if(n2 < n1){
        printf("O menor número é:%.f\n",n2);
    }
    return 0;
}