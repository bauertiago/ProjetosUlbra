public class Programa {
    public static void main(String[] args) {
        int dia = 29; // dia a ser verificado
        int mes = 2; // mês a ser verificado
        int ano = 2022; // ano a ser verificado

        boolean dataValida = true; // variável para armazenar se a data é válida ou não

        if (mes < 1 || mes > 12) { // verifica se o mês é válido
            dataValida = false;
        } else if (mes == 2) { // caso seja fevereiro
            if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) { // verifica se é ano bissexto
                if (dia < 1 || dia > 29) {
                    dataValida = false;
                }
            } else {
                if (dia < 1 || dia > 28) {
                    dataValida = false;
                }
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) { // meses com 30 dias
            if (dia < 1 || dia > 30) {
                dataValida = false;
            }
        } else { // meses com 31 dias
            if (dia < 1 || dia > 31) {
                dataValida = false;
            }
        }

        if (dataValida) {
            System.out.println("A data " + dia + "/" + mes + "/" + ano + " é válida.");
        } else {
            System.out.println("A data " + dia + "/" + mes + "/" + ano + " é inválida.");
        }
    }
}
