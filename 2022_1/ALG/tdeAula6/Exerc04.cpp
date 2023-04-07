#include <stdio.h>
#include <windows.h>
int main(){
    UINT CPAGE_UTF8 = 65001;
    SetConsoleOutputCP(CPAGE_UTF8);
    
    int num1, num2, num3;
    printf("Digite o primeiro número:\n"),
    scanf("%d%*c", &num1);
    printf("Digite o segundo número:\n");
    scanf("%d%*c", &num2);
    printf("Digite o terceiro número:\n");
    scanf("%d%*c", &num3);
    if (num1 < num2 && num1 < num3 && num2 < num3){
        printf("A ordem crescente é:%d %d %d",num1,num2,num3);
    }else if(num1 < num2 && num1 < num3 && num3 < num2){
        printf("A ordem crescente é:%d %d %d",num1,num3,num2);
    }else if(num2 < num1 && num2 < num3 && num1 < num3){
        printf("A ordem crescente é:%d %d %d",num2,num1,num3);
    }else if(num2 < num1 && num2 < num3 && num3 < num1){
        printf("A ordem crescente é:%d %d %d",num2,num3,num1);
    }else if(num3 < num1 && num3 < num2 && num1 < num2){
        printf("A ordem crescente é:%d %d %d",num3,num1,num2);
    }else if(num3 < num1 && num3 < num2 && num2 < num1){
        printf("A ordem crescente é:%d %d %d",num3,num2,num1);
    }
    return 0;
}