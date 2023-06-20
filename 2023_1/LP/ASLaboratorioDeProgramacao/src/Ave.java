//Subclasse Ave de Animal, que herda os atributos e métodos da classe Animal e da Interface Treinavel
public class Ave extends Animal implements Treinavel{
   //Atributo privado
    private double envergaduraAsa;

    //Construtor da classe Ave herdando os atributos da classe Animal
    public Ave(String nome, int idade, double peso, String especie, double envergaduraAsa) {
        super(nome, idade, peso, especie);
        this.envergaduraAsa = envergaduraAsa;
    }

    //Métodos Getter e Setter do atributo privado
    public double getEnvergaduraAsa() {
        return envergaduraAsa;
    }

    public void setEnvergaduraAsa(double envergaduraAsa) {
        this.envergaduraAsa = envergaduraAsa;
    }

    //Metodo da classe Ave
    public void voar(){
        System.out.println("A ave está voando");
    }

    //Implementação do método realizarTruque da Interface Treinavel
    @Override
    public void realizarTruque() {
        System.out.println("A ave realizou um truque voador");
    }

    //Método herdado da classe Animal
    @Override
    public void mostrarInformacoes(){
        System.out.println("Informações da ave: ");
        super.mostrarInformacoes();
        System.out.println("Envergadura da asa: " + getEnvergaduraAsa() + " cm");
    }
}
