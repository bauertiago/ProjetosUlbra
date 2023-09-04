public class Veiculo {
    private String modelo;
    private int ano;

    public String ligar(){
        return "Ligar o carro";
    }
    public String desligar(){
        return "Desligar o carro";
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
