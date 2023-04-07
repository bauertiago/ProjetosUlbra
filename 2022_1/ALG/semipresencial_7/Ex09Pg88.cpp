#include <stdio.h>
#include <windows.h>

int main(){
    UINT CPAGE_UTF8 = 65001;
    SetConsoleOutputCP(CPAGE_UTF8);

    float saldoMed, credito;
    printf("Digite o saldo médio do ultimo ano:\n");
    scanf("%f%*c", &saldoMed);
    if(saldoMed > 400){
        credito=saldoMed*30/100;
        printf("O saldo médio é:%.2f\nO valor do crédito é:%.2f\n", saldoMed, credito);
    }else if(saldoMed > 300 && saldoMed <=400){
        credito=saldoMed*25/100;
        printf("O saldo médio é:%.2f\nO valor do crédito é:%.2f\n", saldoMed, credito);
    }else if(saldoMed > 200 && saldoMed <=300){
        credito=saldoMed*20/100;
        printf("O saldo médio é:%.2f\nO valor do crédito é:%.2f\n", saldoMed, credito);
    }else{
        credito=saldoMed*10/100;
        printf("O saldo médio é:%.2f\nO valor do crédito é:%.2f\n", saldoMed, credito);
    }
    return 0;
}