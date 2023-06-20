//subclasse Mamifero de Animal, herdando os atributos e metodos da classe Animal.
public class Mamifero extends Animal{
    //Atributo privado
    private String tipoPelagem;

    //Construtor da classe Mamifero herdando os atributos da classe Animal
    public Mamifero(String nome, int idade, double peso, String especie, String tipoPelagem){
        super(nome, idade, peso, especie);
        this.tipoPelagem = tipoPelagem;
    }

    //Método da classe Mamifero
    public void amamentar(){
        System.out.println("O mamífero está amamentando");
    }

    //Método herdade da classe Animal
    @Override
    public void mostrarInformacoes(){
        System.out.println("Informações do mamífero: ");
        super.mostrarInformacoes();
        System.out.println("Tipo de Pelagem: " + getTipoPelagem());
    }

    //Método Getter e Setter do atributo privado
    public String getTipoPelagem() {
        return tipoPelagem;
    }

    public void setTipoPelagem(String tipoPelagem) {
        this.tipoPelagem = tipoPelagem;
    }
}
