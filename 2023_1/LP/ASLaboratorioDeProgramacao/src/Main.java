//Classe Main
public class Main {
    public static void main(String[] args) {
        //Criando objetos e demonstrando o uso das classes

        //Parte 1
        //Criando o objeto animal1
        Animal animal1 = new Animal("Leão", 5, 120.5, "Panthera leo");
        //Criando o objeto veterinario1 herdando os atributos da classe Funcionario
        Veterinario veterinario1 = new Veterinario("Tiago","Veterinário",5.000,"Cirurgião");
        //Chamando o metodo realizar Exame da classe Veterinario
        veterinario1.realizarExame(animal1);
        System.out.println("============");

        //Parte 2
        //Criando o objeto mamifero
        Mamifero mamifero = new Mamifero("tigre",12,210,"Panthera tigris","Laranja-avermelhados com listras pretas");
        //chamando o método amamentar da classe Mamifero
        mamifero.amamentar();
        //Chamando o método da classe Mamifero herdado da classe Animal com acrescimo de atributo da classe Mamifero (Polimorfismo)
        mamifero.mostrarInformacoes();
        System.out.println("============");

        //criando o objeto ave
        Ave ave = new Ave("Papagaio",4,1,"Papagaio-verdadeiro",30);
        //chamando o método voar da classe Ave
        ave.voar();
        //chamando o metodo da classe Ave implementado da Interface Treinavel
        ave.realizarTruque();
        //Chamando o método da classe Ave herdado da classe Animal com acrescimo de atributo da classe Ave (Polimorfismo)
        ave.mostrarInformacoes();
        System.out.println("============");

        //Parte 3
        //criando o objeto animal2
        Animal animal2 = new Animal("Onça",7,130,"Panthera onça");
        //chamando o metodo movimentar da classe Animal(sobrecarga do metodo recebendo uma String como argumento)
        animal2.movimentar("Nadando");
        //Chamando o método da classe Animal
        animal2.mostrarInformacoes();
        System.out.println("============");

        //criando o objeto animal3
        Animal animal3 = new Animal("Macaco",10,3.5,"Macaco-prego");
        //chamando o metodo movimentar da classe Animal(sobrecarga do metodo sem receber argumento)
        animal3.movimentar();
        //Chamando o método da classe Animal
        animal3.mostrarInformacoes();
        System.out.println("============");

        //Parte 4
        //criando o objeto zoo e passando o tamanho do array de animais e funcionarios
        Zoo zoo = new Zoo(3,3);
        //chamando o metodo da classe Zoo para adicionar os animais no array
        zoo.adicionarAnimais(animal1);
        zoo.adicionarAnimais(animal2);
        zoo.adicionarAnimais(animal3);
        System.out.println("============");

        //criando o objeto animal4 e chamando o metodo da classe Zoo para mostrar que nao é possivel adicionar mais animais do que o tamanho do array especificado
        Animal animal4 = new Animal("Urso",4,200,"Urso-pardo");
        zoo.adicionarAnimais(animal4);
        System.out.println("============");

        //criando os objetos funcionario1,2,3,4
        Funcionario funcionario1 = new Funcionario("Rosana","Orientadora",2.000);
        Funcionario funcionario2 = new Funcionario("Roger","Segurança",2.500);
        Funcionario funcionario3 = new Funcionario("João","Alimentador",3.000);
        Funcionario funcionario4 = new Funcionario("Luiza","Caixa",2.000);

        //chamando o metodo da classe Zoo para adicionar os funcionarios no array
        zoo.adicionarFuncionarios(funcionario1);
        zoo.adicionarFuncionarios(funcionario2);
        zoo.adicionarFuncionarios(funcionario3);
        //chamando o metodo da classe Zoo para mostrar que nao é possivel adicionar mais funcionarios do que o tamanho do array especificado
        zoo.adicionarFuncionarios(funcionario4);
    }
}
