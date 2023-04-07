#include <stdio.h>
#include <windows.h>

int main() {
    UINT CPAGE_UTF8 = 65001;
    SetConsoleOutputCP(CPAGE_UTF8);
    int num1;
    printf("Digite um número:\n");
    scanf("%D%*c", &num1);
    if(num1 % 5 == 0){
        printf("O número %.d é múltiplo de 5.\n",num1);
    }else{
        printf("O número %.d não é múltiplo de 5.\n",num1);
    }
    return 0;
}