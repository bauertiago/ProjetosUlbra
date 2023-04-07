#include <stdio.h>

int main(void) {
  int num[6];
  int i;
  int cPar=0;
  int cImpar=0;
  for(i=0;i<6;i++){
    printf ("Digite um número:\n");
    scanf ("%d%*c",&num[i]);

    if(num[i]%2==0){
      cPar++;
    }else{
      cImpar++;
      } 
  }
  printf ("O total de pares é:%d\n",cPar);
  for (i=0;i<6;i++){
    if(num[i]%2==0){
      printf ("os pares são:%d\n",num[i]);
    }
  }
  printf ("O total de impares  é:%d\n",cPar);
  for (i=0;i<6;i++){
    if(num[i]%2!=0){
      printf ("os ímpares são:%d\n",num[i]);
    }
  }
  return 0;
}
