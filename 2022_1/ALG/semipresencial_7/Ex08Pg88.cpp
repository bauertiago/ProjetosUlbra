#include <stdio.h>
#include <windows.h>

int main(){
    UINT CPAGE_UTF8 = 65001;
    SetConsoleOutputCP(CPAGE_UTF8);

    float salario, novoSal;
    printf("Digite o salario:\n");
    scanf("%f%*c", &salario);
    if(salario <= 300){
        novoSal=salario+salario*35/100;
        printf("Novo salário é:%.2f\n", novoSal);
    }else if(salario>300){
        novoSal=salario+salario*15/100;
        printf("Novo salário é:%.2f\n", novoSal);
    }
    return 0;
}