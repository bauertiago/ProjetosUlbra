#include <stdio.h>
#include <windows.h>
int main() {
    UINT CPAGE_UTF8 = 65001;
    SetConsoleOutputCP(CPAGE_UTF8);

    int dia1, mes1, ano1;
    int dia2, mes2, ano2;

    printf("Comparador de datas \n");

    printf("Primeira data \n");
    printf("    Digite o dia (1 a 31): ");
    scanf("%d", &dia1);
    printf("    Digite o mês (1 a 12): ");
    scanf("%d", &mes1);
    printf("    Digite o ano: ");
    scanf("%d", &ano1);

    printf("Segunda data \n");
    printf("    Digite o dia (1 a 31): ");
    scanf("%d", &dia2);
    printf("    Digite o mês (1 a 12): ");
    scanf("%d", &mes2);
    printf("    Digite o ano: ");
    scanf("%d", &ano2);

    if (ano1 > ano2 || ano1 == ano2 && (mes1 > mes2 || (mes1 == mes2 && dia1 > dia2))) {
        printf("A maior data é %d/%d/%d \n", dia1, mes1, ano1);
    } else if (ano1 < ano2 || ano1 == ano2 && (mes1 < mes2 || (mes1 == mes2 && dia1 < dia2))) {
        printf("A maior data é %d/%d/%d \n", dia2, mes2, ano2);
    } else {
        printf("As datas são iguais: %d/%d/%d \n", dia1, mes1, ano1);
    }
    return 0;
}