//Classe Zoo
public class Zoo {
    //Atributos e arrays privados
    private Animal[] animaisZoo;
    private Funcionario[] funcionariosZoo;
    private int numAnimais;
    private int numFuncionarios;

    //Construtor da classe Zoo recebendo a definição do tamanho dos arrays
    public Zoo(int numAnimaisZoo,int numFuncionariosZoo){
        animaisZoo = new Animal[numAnimaisZoo];
        funcionariosZoo = new Funcionario[numFuncionariosZoo];
        numAnimais = 0;
        numFuncionarios = 0;
    }

    //Método da classe Zoo para adicionar um animal ao array de animais
    public void adicionarAnimais(Animal animal){
        if(numAnimais < animaisZoo.length){
            animaisZoo[numAnimais] = animal;
            numAnimais++;
            System.out.println("Animal adicionado com sucesso");
        }else{
            System.out.println("Número de animais esgotado");
        }
    }

    //Método da classe Zoo para adicionar um funcionario ao array de funcionarios
    public void adicionarFuncionarios(Funcionario funcionario){
        if(numFuncionarios < funcionariosZoo.length){
            funcionariosZoo[numFuncionarios] = funcionario;
            numFuncionarios++;
            System.out.println("Funcionário adicionado com sucesso");
        }else{
            System.out.println("Número de funcionário esgotado");
        }
    }

}
