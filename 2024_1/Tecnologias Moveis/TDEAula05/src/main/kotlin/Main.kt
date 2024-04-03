fun main() {

    println("1 -")
    val charGenerator = CharGenerator(1, 10)
    println("Novo Caractere: ${charGenerator.gerarCaracter()}")

    println("2 -")
    val pessoa = Pessoa("Tiago", 35)
    println("${pessoa.nome}, ${pessoa.idade}")
    println(pessoa.caminhar())
    println(pessoa.falar())

    println("3 -")
    val result: Result = Result.Sucesso("Sucesso")
    when (result) {
        is Result.Sucesso -> println("Sucesso")
        is Result.Erro -> println("Erro")
        is Result.Loading -> println("Carregando")
    }

    println("4 -")
    val nomeOriginal = Person()
    println("Nome: ${nomeOriginal.nome}")

    val nomeAlterado = nomeOriginal.copy(nome = "Tiago Bauer de Matos")
    println("Novo nome: ${nomeAlterado.nome}")
}


// 1 - Crie uma classe "CharGenerator" que receba no seu construtor primário (primary constructor),
// um valor min e um max e tenha um método onde gere um novo caracter.
//class CharGenerator(val min: Int, val max: Int){
//    fun gerarCaracter(): Char {
//        return (min..max).random().toChar()
//    }
//}

// Função Inline
class CharGenerator(val min: Int, val max: Int){
    fun gerarCaracter() = (min..max).random().toChar()
}


// 2 - Crie uma classe pessoa que tenha um construtor primário que recebe nome e idade como parâmetro,
// além disso, é necessário ter um método caminhar e falar. Obs: Os métodos caminhar e falar devem apenas printar "caminhando" e "falando"
class Pessoa(val nome: String, val idade: Int){
    fun caminhar(): String{
        return "caminhando"
    }
    fun falar(): String{
        return "falando"
    }
}


// 3 - Crie uma sealed class que tenha o nome result e algumas classes que herdam da mesma,
// como Sucesso, Error e Loading. Utilizar sintaxe apresentada em aula.
sealed class Result {
    class Sucesso(val dados: String) : Result()
    class Erro(val excecao: String) : Result()
    class Loading : Result()
}


// 4 - Crie uma data class pessoa que recebe no seu construtor primário nome, idade, profissão e cpf,
// ambos são parâmetros imutáveis. Após instanciar a classe, utilize o método copy para criar uma nova instância alterando o nome passando por parâmetro o nome completo.
data class Person(val nome: String = "Tiago", val idade: Int = 35, val profissão: String = "Operador", val cpf: Long = 10101010101)

