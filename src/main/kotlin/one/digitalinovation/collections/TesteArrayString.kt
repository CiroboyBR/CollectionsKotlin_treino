package one.digitalinovation.collections

fun main() {
    val nomes = Array(3){""}
    nomes[0] = "Mario"
    nomes[1] = "Dede"
    nomes[2] = "Rita"

    for (nome in nomes) {
        println(nome)
    }

    println("ForEach Lambda ------------------")
    nomes.sort()
    nomes.forEach { println(it) }

    val nomes2 = arrayOf("zaza","Bilu","Carlos")
    println("ForEach Lambda ------------------")
    nomes2.sort()
    nomes2.forEach { println(it) }

}