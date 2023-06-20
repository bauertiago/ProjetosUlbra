//Classe Animal
public class Animal {
    //Atributos privados
    private String nome;
    private int idade;
    private double peso;
    private String especie;

    //Construtor da Classe Animal
    public Animal(String nome, int idade, double peso, String especie){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.especie = especie;
    }

    //Metodo da classe Animal para mostrar as informações do Animal
    public void mostrarInformacoes(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade()+ " anos") ;
        System.out.println("peso: " + getPeso() + " kg");
        System.out.println("Espécie: " + getEspecie());
    }

    //Metodos movimentar com sobrecarga, um recebendo uma String como argumento e outro sem receber nada como argumento.
    public void movimentar(String tipoMovimento){
        System.out.println("O animal se moveu " + tipoMovimento);
    }
    public void movimentar(){
        System.out.println("O animal se moveu de forma padrão");
    }

    //Metodos Getter e setter dos atributos privados
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
