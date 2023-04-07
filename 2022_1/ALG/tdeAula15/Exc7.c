#include <stdio.h>
#include <windows.h>

int main() {
     UINT CPAGE_UTF8 = 65001;
    SetConsoleOutputCP(CPAGE_UTF8);

  float num[7];
  float negativo;
  int i;
  float soma=0;
  for(i=0;i<7;i++){
  printf("%d - Digite um número:\n",i+1);
  scanf("%f%*c",&num[i]);
  }
  for(i=0;i<7;i++){
      if(num[i]<0){
          negativo++;
      }else{
          soma=soma+num[i];
      }
  }
  printf("foram digitados %.f números negativos e a soma dos números positivos é:%.2f\n",negativo,soma);
  return 0;
}
