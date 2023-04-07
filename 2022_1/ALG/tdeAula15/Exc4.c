#include <stdio.h>

int main() {
  int num[15];
  int i;
  int igual=0;
  for(i=0;i<15;i++){
    printf("%d - Digite um número:\n",i+1);
    scanf("%d%*c", &num[i]);
    if(num[i]==30){
      igual++;
    }
}
  printf(" O total de números iguais a 30 é:%d\n",igual);
  for(i=0;i<15;i++){
    if(num[i]==30){
      printf("o número 30 está na posição %d\n",i);
    }
  }
  return 0;
}
