#include <stdio.h>
#define SENHA 1234

int main() {
  
  int i = 0, senha;
  while (senha != SENHA){
    printf("Digite a sua senha:\n");
    scanf("%d%*c", &senha);
    if (senha == SENHA) {
      printf("%d tentativas - ACESSO PERMITIDO\n", (i+1));
      break;
    }
    printf("ACESSO NEGAGO\n");
    i++;
  }
  return 0;
}