//subclasse Veterinario de Funcionario, herdando os atributos e metodos da classe Funcionario.
public class Veterinario extends Funcionario{
    //Atributo privado
    String especialidade;

    //Construtor da classe Veterinario, herdando os atributos da classe Funcionario
    public Veterinario(String nome, String cargo, double salario, String especialidade){
        super(nome, cargo, salario);
        this.especialidade = especialidade;
    }

    //Método da classe Veterinario
    public void realizarExame(Animal animal){
        System.out.println("O veterinário " + getNome() + ", está realizando exame no animal: " + animal.getNome());
    }

    //Metodo Getter e Setter do atributo privado
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
