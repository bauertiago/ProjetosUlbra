#include <stdio.h>
#include <windows.h>

int main(){
    UINT CPAGE_UTF8 = 65001;
    SetConsoleOutputCP(CPAGE_UTF8);

    float salario, novoSal;
    printf("Digite o salário:\n");
    scanf("%f%*c", &salario);
    novoSal=salario+salario*30/100;
    if (salario<500)
    {
        printf("O novo salário é:%.2f\n",novoSal);    
    }else{
        printf("Você não tem direito ao aumento!!");
    }
    return 0;
}