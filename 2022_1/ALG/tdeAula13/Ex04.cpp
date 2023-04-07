#include <stdio.h>

int main() {
  float num1, num2;
  float divisao; 
  char opcao;

  do{
    printf("digite um número\n");
    scanf("%f%*c",&num1);
       do{
         printf("digite outro número\n");
         scanf("%f%*c",&num2);
          if(num2==0){
            printf("Número inválido\n");
            }
       }while(num2==0);
    divisao=num1/num2;
    printf("a divisao de %f / %f é %.2f\n",num1,num2,divisao);
    printf("Deseja efetuar novo cálculo?[s/n]\n");
    scanf("%s%*c",&opcao);

  }while((opcao == 's')||(opcao == 'S'));
  
  return 0;
}