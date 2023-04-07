/*6. Faça um programa que receba do usuário um vetor com 10 posições. 
Em seguida, deverá ser impresso o maior e o menor elemento do vetor.*/ 

#include <stdio.h>

int main() {
  int num[10];
  int i,maior, menor;
  for(i=0;i<10;i++){
    printf("%d - Digite um número:\n",i+1);
    scanf ("%d%*c",&num[i]);
  }
  maior = num[0];
  for(i=0;i<10;i++){
    if(num[i] > maior){
      maior=num[i];
    }
  }printf ("o maior número é:%d\n",maior);

  menor = num[0];
  for(i=0;i<10;i++){
    if(num[i] < menor){
      menor=num[i];
    }
  }printf ("o menor número é:%d\n",menor);
  printf("foram digitados %.d números",i);
  return 0;
}