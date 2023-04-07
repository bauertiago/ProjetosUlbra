#include <stdio.h>
#include <windows.h>
int main(){
    UINT CPAGE_UTF8 = 65001;
    SetConsoleOutputCP(CPAGE_UTF8);
    
    int num1, num2, num3, num4;
    printf("Digite três números em ordem crescente:\n");
    scanf("%d%*c",&num1);
    scanf("%d%*c",&num2);
    scanf("%d%*c",&num3);
    if(num1 < num2 && num2 < num3 && num1 < num3){
        printf("Digite um número fora de ordem\n");
        scanf("%d%*c",&num4);
    }else{
        printf("Ordem inválida");
    }if (num4 > num3){
        printf("A ordem decrescente é:%d %d %d %d",num4,num3,num2,num1);
    }else if(num4 > num2){
        printf("A ordem decrescente é:%d %d %d %d",num3,num4,num2,num1);
    }else if(num4 > num1){
        printf("A ordem decrescente é:%d %d %d %d",num3,num2,num4,num1);
    }else if(num4 < num1){
        printf("A ordem decrescente é:%d %d %d %d",num3,num2,num1,num4);
    }
    return 0;
}