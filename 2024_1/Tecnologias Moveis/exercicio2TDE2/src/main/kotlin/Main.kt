fun main(args: Array<String>) {
    val traducao = when(args[0]){
        "blue" -> "Azul"
        "red" -> "Vermelho"
        "green" -> "Verde"
        "Yellow" -> "Amarelo"
        else -> "Cor não encontrada"
    }
    print(traducao)
}