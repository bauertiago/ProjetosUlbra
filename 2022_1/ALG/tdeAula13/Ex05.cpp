#include <stdio.h>

int main() {
 
  int valor1, valor2;
  
  while(valor1 != valor2){
    printf("Digite um número:\n");
    scanf("%d%*c", &valor1);
    printf("Digite outro número:\n");
    scanf("%d%*c", &valor2);
    if (valor1 < valor2){
      printf("%d _ %d - Ordem crescente\n", valor1, valor2);
    }
    else if (valor1 > valor2) {
      printf("%d _ %d - Ordem decrescente\n",valor1, valor2);
    }
    else{
      printf("fim\n");
      break;
    }
  }
  return 0;
}