#include <stdio.h>
#include <windows.h>

int main(){
    UINT CPAGE_UTF8 = 65001;
    SetConsoleOutputCP(CPAGE_UTF8);

    float custoFab, distribuidor, imposto, preco;
    printf("Digite o custo de fábrica:\n");
    scanf("%f%*c", &custoFab);
    if(custoFab < 12000){
        distribuidor=custoFab*5/100;
        preco=custoFab+distribuidor;
        printf("O preço ao consumidor é:%.2f\n",preco);
    }else if(custoFab>=12000 && custoFab<25000){
        distribuidor=custoFab*10/100;
        imposto=custoFab*15/100;
        preco=custoFab+distribuidor+imposto;
        printf("O preço ao consumidor é:%.2f\n", preco);
    }else{
        distribuidor=custoFab*15/100;
        imposto=custoFab*20/100;
        preco=custoFab+distribuidor+imposto;
        printf("O preço ao consumidor é:%.2f\n", preco);
    }
    return 0;
}