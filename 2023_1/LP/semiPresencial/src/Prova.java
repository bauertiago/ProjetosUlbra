public class Prova {
    private double notaParte1;
    private double notaParte2;

    //Prova recebe duas notas e inicializa os campos notaParte1 e notaParte2 com esses valores.
    public Prova(double notaParte1, double notaParte2){
        this.notaParte1 = notaParte1;
        this.notaParte2 = notaParte2;
    }

    //Definindo o método "calcularNotaTotal()" que calcula a nota total da prova, somando as notas das duas partes.
    // Se a nota total for superior a 10, o método atribui o valor 10 à nota total. O método retorna o calculo da nota total.
    public double calcularNotaTotal(){
        double notaTotal = notaParte1 + notaParte2;
        if(notaTotal > 10){
            notaTotal = 10;
        }
        return notaTotal;
    }
}
