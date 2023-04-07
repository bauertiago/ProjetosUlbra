#include <stdio.h>

int main() {
  int num[7];
  int i;
  int mult2=0;
  int mult3=0;
  int mult2e3=0;
  for(i=0;i<7;i++){
    printf("%d - Digite um número \n",i+1);
    scanf("%d%*c",&num[i]);
    if(num[i]%2==0){
    mult2++;
   }
  }
  printf("O total de números múltiplos de 2 é:%d\n",mult2);
  for(i=0;i<7;i++){
    if(num[i]%2==0){   
      printf("%d,",num[i]);
    }
  }
  
  for(i=0;i<7;i++){
    if(num[i]%3==0){
      mult3++;
      }
    }
      printf("\nO total de números múltiplos de 3 é:%d\n",mult3);
  for(i=0;i<7;i++){
    if(num[i]%3==0){   
      printf("%d,",num[i]);
    }
  }

  for(i=0;i<7;i++){
    if(num[i]%2==0 && num[i]%3==0){
      mult2e3++;
      }
    }
  printf("\nO total de números múltiplos de 2 e 3 é:%d\n",mult2e3);
  for(i=0;i<7;i++){
    if(num[i]%2==0 && num[i]%3==0){
      printf("%d,",num[i]);
    }
   }
  return 0;
}
