#include <stdio.h>
#include <windows.h>
int main(){
    UINT CPAGE_UTF8 = 65001;
    SetConsoleOutputCP(CPAGE_UTF8);
    
    int num;
    printf("digite um número\n");
    scanf("%d%*c", &num);
    if(num % 2 == 0){
        printf("É um número par!");
    }else{
        printf("É um número impar!");
    }
    return 0;
}