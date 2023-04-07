#include <stdio.h>
#include <windows.h>
int main(){
     UINT CPAGE_UTF8 = 65001;
    SetConsoleOutputCP(CPAGE_UTF8);

    int TAM=7;
    char nomes[TAM] [10];
    float notas[TAM];
    int i;
   for(i=0; i<TAM; i++){
  printf("%d - Digite o nome %d\n",i+1);
  scanf("%s",&nomes[i]);
  printf("%d - Digite a nota %d\n",i+1);
  scanf("%s",&notas[i]);
  }
  int maiorMedia=0;

  for(i=0;i<TAM;i++){
      if (notas[i]<7){
       notas[i]= 10 - notas[i];
       printf("Aluno");
      }
      
   if(notas[maiorMedia]<notas[i]){
       maiorMedia=i;
   }
  }
  printf("foram digitados %.f números negativos e a soma dos números positivos é:%.2f\n",negativo,soma);
  return 0;
}