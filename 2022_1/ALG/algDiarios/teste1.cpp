#include <stdio.h>
int main(){
    int x, y=1;
    for (x=0;x<=3;x++){
        y+=x;
    }
    printf("%d",y+x);
    return 0;
}