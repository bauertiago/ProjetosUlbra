#include <stdio.h>
int main(){
   int x, f;
   f=10;
   for(x=1;x<f;x++){
      if(x%2==0){
         f++;
         continue;
      }
      if(f==x){
         break;
      }
   }
   printf("valor de x=%d\n",x);
   printf("valor de f=%d\n",f);
}