#include <stdio.h>
#include <windows.h>

int main(){
     UINT CPAGE_UTF8 = 65001;
    SetConsoleOutputCP(CPAGE_UTF8);
    
    printf("Números impares de 1000 a 1500\n");
    for (int i = 1000; i < 1500; i++){
        if(i%2!=0){
            printf("%d\n", i);
        }
    }
    return 0;
}