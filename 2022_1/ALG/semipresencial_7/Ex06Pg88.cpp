#include <stdio.h>
#include <math.h>
#include <windows.h>

int main(){
    UINT CPAGE_UTF8 = 65001;
    SetConsoleOutputCP(CPAGE_UTF8);
    int op;
    float num1,num2;
        
    printf("\nMENU\n Para elevar digite 1\n Para raiz quadrada digite 2\n Para raiz cúbica digite 3\n");
    printf("\nQual operação deseja selecionar?\n");
    scanf("%d%*c", &op);

    if (op == 1){
        printf("Digite um número:\n");
        scanf("%f%*c", &num1);
        printf("Digite outro número:\n");
        scanf("%f%*c", &num2);
        printf("Pimeiro número elevado ao segundo:%.2f",pow(num1,num2));
    }else if (op == 2){
        printf("Digite um número:\n");
        scanf("%f%*c", &num1);
        printf("Digite outro número:\n");
        scanf("%f%*c", &num2);
        printf("A raiz quadrada do primeiro número é:%.2f",sqrt(num1));
        printf("A raiz quadrada do segundo número é:%.2f",sqrt(num2));
    }else if (op ==3){
        printf("Digite um número:\n");
        scanf("%f%*c", &num1);
        printf("Digite outro número:\n");
        scanf("%f%*c", &num2);
        printf("A raiz cúbica do primeiro número é:%.2f",cbrt(num1));
        printf("A raiz cúbica do segundo número é:%.2f",cbrt(num2));
    } else {
        printf("ERRO: Selecione uma opção válida");
    }
    return 0;
}