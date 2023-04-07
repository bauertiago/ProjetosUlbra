public class Programa {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.setMarca("Renault");
        carro1.setModelo("kwid");
        carro1.setAno(2019);

        System.out.println("Marca: " + carro1.getMarca());
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Ano: " + carro1.getAno());
    }
}
