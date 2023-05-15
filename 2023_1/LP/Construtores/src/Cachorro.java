public class Cachorro {
    private String nome;
    private String raca;
    private int idade;

    public Cachorro(String nome, String raca, int idade){
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }
    public Cachorro(String nome, String raca){
        this.nome = nome;
        this.raca = raca;
        this.idade = 1;
    }
    public void imprimirCachorros(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Raça: " + this.raca);
        System.out.println("Idade: " + this.idade);
    }

}
