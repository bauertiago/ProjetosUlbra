public class Bateria implements Carregavel, Descarregavel{
    public int nivel;
    public Bateria(int nivel){
        this.nivel = nivel;
    }
    @Override
    public void carga() {
        if(nivel < 100){
            System.out.println("precisando de carga");
        }else{
            System.out.println("Carga cheia");
        }
    }
}
