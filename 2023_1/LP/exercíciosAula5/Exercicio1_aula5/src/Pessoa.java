public class Pessoa {
    //atributos
    private String nome;
    private int idade;
    private double altura;

    //método publico (get) para OBTER os valores dos atributos
    public String getNome() {
        return nome;
    }

    //método publico (set) para DEFINIR os valores dos atributos
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
}
