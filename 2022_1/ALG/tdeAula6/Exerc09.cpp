#include <stdio.h>
#include <time.h>
#include <windows.h>

int main(){

    UINT CPAGE_UTF8 = 65001;
    SetConsoleOutputCP(CPAGE_UTF8);
    
    struct tm *data_hora_atual;
    time_t segundos;
    time(&segundos);
    data_hora_atual = localtime(&segundos);
    int hora = data_hora_atual ->tm_hour;
    int minuto = data_hora_atual ->tm_min;
    int segundo = data_hora_atual ->tm_sec;
    int dia = data_hora_atual ->tm_mday;
    int diaAno = data_hora_atual ->tm_yday;
    int diaSemana = data_hora_atual ->tm_wday;
    int mes = data_hora_atual ->tm_mon+1;
    int ano = data_hora_atual ->tm_year+1900;

    if (mes == 1){
        printf("Dia: %d\n",dia);
    printf("Mês: Janeiro\n",mes);
    printf("Ano: %d\n",ano);
    printf("Dia do Ano: %d\n",diaAno);
    printf("Dia da semana: %d\n",diaSemana);

    printf("Hora: %d:",hora);
    printf("%d:",minuto);
    printf("%d:",segundo);

    printf("Data: %d/%d/%d", dia,mes,ano);
    }else if(mes == 5){
    printf("Dia: %d\n",dia);
    printf("Mês: Maio\n",mes);
    printf("Ano: %d\n",ano);
    printf("Dia do Ano: %d\n",diaAno);
    printf("Dia da semana: %d\n",diaSemana);

    printf("Hora: %d:",hora);
    printf("%d:",minuto);
    printf("%d:",segundo);

    printf("Data: %d/%d/%d", dia,mes,ano);
    }else if(mes == 2){
    printf("Dia: %d\n",dia);
    printf("Mês: Fevereiro\n",mes);
    printf("Ano: %d\n",ano);
    printf("Dia do Ano: %d\n",diaAno);
    printf("Dia da semana: %d\n",diaSemana);

    printf("Hora: %d:",hora);
    printf("%d:",minuto);
    printf("%d:",segundo);

    printf("Data: %d/%d/%d", dia,mes,ano);
    }
    return 0;
}