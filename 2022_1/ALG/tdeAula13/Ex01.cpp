#include <stdio.h>
int main(){
    float nota, media;
    float total=0;
    int cont=0;
    do
    {
        printf("Digite a nota:\n",cont+1);
    scanf("%f%*c",&nota);
    if(nota>0){        
    total=nota+total;
    cont++;
    }else{
        break;
    }
    } while (nota>0);
    media=total/cont;
    printf("A média da turma é:%.2f",media);
   
}