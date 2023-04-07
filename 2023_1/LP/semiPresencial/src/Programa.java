public class Programa {
    public static void main(String[] args) {
        //instanciando o objeto Prova para declarar os valores a os valores da parte1 e parte2 da prova1 e 2 de cada aluno
        Prova parte1aluno1 = new Prova(3,4.5);
        Prova parte2aluno1 = new Prova(3.5,5.0);
        //calculando a nota total do aluno e armazenando na variavel double:
        double notaTotal = parte1aluno1.calcularNotaTotal();
        double notaTotal1 = parte2aluno1.calcularNotaTotal();
        //instanciando o objeto Aluno, para receber a nota das duas provas, declaradas no objeto Prova anteriormente:
        Aluno aluno1 = new Aluno(parte1aluno1,parte2aluno1);

        Prova parte1aluno2 = new Prova(4.0,5.0);
        Prova parte2aluno2 = new Prova(5.0,3.0);
        double notaTotal2 = parte1aluno2.calcularNotaTotal();
        double notaTotal3 = parte2aluno2.calcularNotaTotal();
        Aluno aluno2 = new Aluno(parte1aluno2,parte2aluno2);

        Prova parte1aluno3 = new Prova(4.0,3.0);
        Prova parte2aluno3 = new Prova(3.5,3.5);
        double notaTotal4 = parte1aluno3.calcularNotaTotal();
        double notaTotal5 = parte2aluno3.calcularNotaTotal();
        Aluno aluno3 = new Aluno(parte1aluno3,parte2aluno3);

        //instanciando o Objeto Turma, para receber os valores das medias de cada aluno, para depois calcular a media da turma atraves do método "turma.calcularMedia()":
        Turma turma = new Turma(aluno1,aluno2,aluno3);

        System.out.println("Prova1 do aluno1: " + notaTotal + " Prova2 do aluno1: " + notaTotal1);
        System.out.println("Sua média é: " + aluno1.calcularMedia());
        System.out.println("Prova1 do aluno2: " + notaTotal2 + " Prova2 do aluno2: " + notaTotal3);
        System.out.println("Sua média é: " + aluno2.calcularMedia());
        System.out.println("Prova1 do aluno3: " + notaTotal4 + " Prova2 do aluno3: " + notaTotal5);
        System.out.println("Sua média é: " + aluno3.calcularMedia());
        System.out.println("A média da turma é " + turma.calcularMedia());
    }
}
