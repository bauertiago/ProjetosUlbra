#include <stdio.h>
#include <math.h>

int main() {
    float Senha;
    printf("Insira a senha:");
    scanf("%f%*c", &Senha);

    if (Senha != 4531){
        printf("Acesso Negado...");
    }else{
        printf("Acesso Liberado...");
    }
    return 0;
}