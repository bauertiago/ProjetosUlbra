public class Cliente {
    private String nome;
    private int idade;
    private Conta conta;

    public Cliente(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setConta(Conta conta){
        this.conta = conta;
    }

    public Conta getConta(){
        return conta;
    }
}
