#include <stdio.h>
#include <math.h>
#include <windows.h>

int main(){
    UINT CPAGE_UTF8 = 65001;
    SetConsoleOutputCP(CPAGE_UTF8);
    
    int op;
    float num1,num2,soma;

    printf("\nMENU\n Para somar dois números digite 1\n Para raíz quadrada de um número digite 2\n");
    printf("Qual operação deseja selecionar?\n");
    scanf("%d%*c",&op);

    if(op == 1){
        printf("Digite o primeiro número:\n");
        scanf("%f%*c", &num1);
        printf("Digite o segundo número:\n");
        scanf("%f%*c",&num2);
        soma = num1 + num2;
        printf("A soma dos dois números é:%.f\n",soma);
    }else if(op == 2){
        printf("Digite um número:\n");
        scanf("%f%*c",&num1);
        printf("A raiz quadrada do número %.f é:%.2f",num1,sqrt(num1));
    }else{
        printf("ERRO, digite uma opção Válida");
    }
    return 0;
}