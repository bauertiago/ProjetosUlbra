fun main() {
    val arrayNumeros = arrayOf(1, 2, 3, 4, 5, 3, 8)
    val resultNumeros = numerosDaLista(arrayNumeros, ::concatenar)
    println(resultNumeros)

    val arrayStrings = arrayOf("tiago", "daniel")
    val resultStrings = stringsDaLista(arrayStrings, ::maiuscula)
    println(resultStrings)

}

fun numerosDaLista(array: Array<Int>, tarefa: (Array<Int>) -> String) = "O resultado é: ${tarefa(array)}"

//1
fun media(array: Array<Int>) = (array.sum())/array.size

//2
fun pares(array: Array<Int>) = array.filter { it % 2 == 0 }.joinToString (", " )

//3
fun removeDuplicados(array: Array<Int>) = array.distinct().joinToString(", ")

//4
fun ultimoImpar(array: Array<Int>) = array.lastOrNull {it % 2 != 0}.toString()



fun stringsDaLista(arrayStrings: Array<String>, tarefaStrings: (Array<String>) -> String) = "O resultado é: ${tarefaStrings(arrayStrings)}"

//6
fun maiuscula(arrayStrings: Array<String>) = arrayStrings.map { it.uppercase() }.toString()

//7
fun concatenar(array: Array<Int>) = array.map { "R$$it" }.toString()