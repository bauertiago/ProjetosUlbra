#include <stdio.h>
int main(){
    int idade;
    printf("Digite sua Idade:\n");
    scanf("%d%*c", &idade);
    if (idade >= 18 && idade < 70){
        printf("Seu voto é obrigatório\n");
    }else if (idade >= 16 && idade < 18 || idade >= 70){
        printf("Seu voto é facultativo\n");
    }else{
        printf("Você não esta apto para votar\n");
    }
    return 0;
}