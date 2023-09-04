public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo();
        veiculo1.setAno(2017);
        veiculo1.setModelo("L200 Triton");

        Veiculo veiculo2 = new Veiculo();
        veiculo2.setAno(2020);
        veiculo2.setModelo("Ford Ranger");

        System.out.println(veiculo1.ligar() + " " + veiculo1.getModelo() + ", Ano: " + veiculo1.getAno());
        System.out.println(veiculo2.ligar() + " " + veiculo2.getModelo() + ", Ano: " + veiculo2.getAno());

    }
}