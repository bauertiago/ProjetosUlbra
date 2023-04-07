#include <stdio.h>
#include <math.h>
#include <windows.h>

int main(){
    UINT CPAGE_UTF8 = 65001;
    SetConsoleOutputCP(CPAGE_UTF8);
    int op;
    float num1,num2,media,subtracao1,subtracao2,multipicacao,divisao;
        
    printf("\nMENU\n Para média entre os dois números digite 1\n Para diferença do maior pelo menor digite 2\n Para produto entre os números digite 3\n Para divisão do primeiro número pelo segungo, digite 4");
    printf("\nQual operação deseja selecionar?\n");
    scanf("%d%*c", &op);

    if(op != 1 && op != 2 && op != 3 && op != 4){
        printf("ERRO, escolha uma opção correta.\n");
    }else if(op == 1){
        printf("Digite um número:\n");
        scanf("%f%*c", &num1);
        printf("Digite outro número:\n");
        scanf("%f%*c", &num2);
        media=(num1+num2)/2;
        printf("A média entre os dois números é:%.2f",media);
    }else if(op == 2){
        printf("Digite um número:\n");
        scanf("%f%*c", &num1);
        printf("Digite outro número:\n");
        scanf("%f%*c", &num2);
        if (num1>num2){
            subtracao1 = num1 - num2;
            printf("A diferença do maior para o menor é:%.2f\n",subtracao1);
        }else if (num2>num1){
            subtracao2 = num2 - num1;
            printf("A diferença do maior para o menor é:%.2f\n",subtracao2);
        }
    }else if (op == 3){
        printf("Digite um número:\n");
        scanf("%f%*c", &num1);
        printf("Digite outro número:\n");
        scanf("%f%*c", &num2);
        multipicacao = num1 * num2;
        printf("O produto entre os números digitados é:%.2f",multipicacao);
    }else if (op == 4){
        printf("Digite um número:\n");
        scanf("%f%*c", &num1);
        printf("Digite outro número diferente de zero:\n");
        scanf("%f%*c", &num2);
        if (num2 != 0){
        divisao = num1 / num2;
        printf("O resultado da divisão do primeiro numero pelo segundo é:%.2f",divisao);
        }else{
        printf("ERRO, digite um número diferente de zero");
        }
    }
    return 0;
}