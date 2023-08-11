import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> clubes = new ArrayList<>();
        adicionar(clubes,"Grêmio" );
        adicionar(clubes,"Internacional");
        adicionar(clubes,"Juventude");
        adicionar(clubes,"Caxias");

        lerTodaLista(clubes);

        System.out.println(lerItemLista(clubes, 0));

        deletar(clubes,1);
        lerTodaLista(clubes);

        atualizar(clubes, 2,"Brasil de Pelotas");
        lerTodaLista(clubes);

    }

    public static void adicionar(ArrayList<String> lista, String nomeClube){
        lista.add(nomeClube);
    }

    public static void lerTodaLista(ArrayList<String> lista){
        System.out.println(lista);
    }
    public static String lerItemLista(ArrayList<String> lista, int index){
        return lista.get(index);
    }

    public static void deletar(ArrayList<String> lista, int index){
        lista.remove(index);
    }

    public static void atualizar(ArrayList<String> lista, int index, String novoNome){
        lista.set(index,novoNome);
    }
}
