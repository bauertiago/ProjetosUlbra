public class InvertendoArray {
    public static void main(String[] args) {
        String [] cores = {"Vermelho ", "Azul ", "Verde ", "Amarelo ", "Roxo "};
        for (int x = 0; x < cores.length; x++){
            System.out.println(cores[x]);
        }

        System.out.println("====================");

        for (int x  = cores.length - 1; x >=0; x--){
            System.out.println(cores[x]);
        }
    }
}
