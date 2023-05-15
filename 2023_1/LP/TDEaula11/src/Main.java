public class Main {
    public static void main(String[] args) {

        System.out.println("Exercício 1");
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Rosana";
        pessoa.idade = 35;

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Tiago";
        funcionario.idade = 34;
        funcionario.cargo = "Operador";

        System.out.println("Pessoa: " + pessoa.nome + ", idade: " + pessoa.idade);
        System.out.println("Funcionario: " + funcionario.nome + ", idade: " + funcionario.idade + ", cargo: " + funcionario.cargo);
        System.out.println("==========================");

        System.out.println("Exercício 2");
        Veiculo veiculo = new Veiculo();
        veiculo.marca = "Renault";
        veiculo.modelo = "Kwid";

        Carro carro = new Carro();
        carro.marca = "Ford";
        carro.modelo = "Ranger";
        carro.numPassageiros = 5;

        System.out.println("Marca do veiculo: " + veiculo.marca + ", Modelo: " + veiculo.modelo);
        System.out.println("Marca do carro: " + carro.marca + ", Modelo: " + carro.modelo + ", Número de passageiros: " + carro.numPassageiros);
        System.out.println("==========================");

        System.out.println("Exercício 3");
        FiguraGeometrica figura = new FiguraGeometrica();
        double area = figura.calcularArea();
        double perimetro = figura.calcularPerimetro();

        Quadrado quadrado = new Quadrado(5);
        area = quadrado.calcularArea();
        perimetro = quadrado.calcularPerimetro();

        System.out.println("Área do quadrado: " + area);
        System.out.println("Perímetro do quadrado: " + perimetro);
        System.out.println("==========================");

        System.out.println("Exercício 4");
        Conta conta = new Conta();
        conta.numero = 12345;
        conta.saldo = 500000;

        ContaCorrente contaC = new ContaCorrente();
        contaC.numero = 54321;
        contaC.saldo = 200000;
        contaC.limite = 10000;

        System.out.println("Número da conta: " + conta.numero + ", Saldo: " + conta.saldo);
        System.out.println("Número da conta corrente: " + contaC.numero + ", Saldo: " + contaC.saldo + ", Limite: " + contaC.limite);
        System.out.println("==========================");

        System.out.println("Exercício 5");
        Animal rato = new Animal();
        rato.emitirSom();

        Cachorro cachorro = new Cachorro();
        cachorro.latir();

        System.out.println("==========================");

        System.out.println("Exercício 6");
        Pessoa pessoa1 = new Pessoa();
        pessoa1.falar();
        pessoa1.andar();

        Estudante estudante = new Estudante();
        estudante.estudar();
        System.out.println("==========================");

        System.out.println("Exercício 7");
        Produto maionese = new Produto();
        maionese.codigo = 23456;
        maionese.preco = 10.00;

        ProdutoPerecivel costela = new ProdutoPerecivel();
        costela.codigo = 12345;
        costela.preco = 29.50;
        costela.dataValidade = "10/06/2023";

        System.out.println("Código do produto: " + maionese.codigo + ", Preço: " + maionese.preco);
        System.out.println("Código do produto perecível: " + costela.codigo + ", Preço: " + costela.preco + ", Data de Validade: " + costela.dataValidade);
        System.out.println("==========================");

        System.out.println("Exercício 8");
        Animal animal = new Animal();
        animal.mover();

        Peixe peixe = new Peixe();
        peixe.mover();
        System.out.println("==========================");

        System.out.println("Exercício 9");
        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Helena";
        pessoa2.idade = 40;
        pessoa2.endereco = "Rua 1, numero 2";

        Cliente cliente = new Cliente();
        cliente.nome = "Rosana";
        cliente.idade = 36;
        cliente.endereco = "Avenida 1, numero 3";
        cliente.numeroCartao = 123456789;

        System.out.println("Nome pessoa: " + pessoa2.nome + ", idade: " + pessoa2.idade + " anos " + ", endereço: " + pessoa2.endereco);
        System.out.println("Nome Cliente: " + cliente.nome + ", idade: " + cliente.idade + " anos " + ", endereço: " + cliente.endereco + ", Número do cartão: " + cliente.numeroCartao);
        System.out.println("==========================");

        System.out.println("Exercício 10");
        Animal animal1 = new Animal();
        animal1.emitirSom();

        Gato gato = new Gato();
        gato.emitirSom();
        System.out.println("==========================");

    }
}
