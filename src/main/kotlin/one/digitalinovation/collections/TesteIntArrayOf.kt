package one.digitalinovation.collections

fun main() {
    val values = intArrayOf(1, 2, 5, 3, 4)

    println("For normal")
    for(valor in values) {
        println(valor)
    }

    println("--------------------------------------------")
    println("ForEach")
    values.forEach {
        println(it)
    }

    println("--------------------------------------------")
    println("ForEach com variavel")
    values.forEach { valor->
        println(valor)
    }

    println("--------------------------------------------")
    println("For de indices")
    for (indice in values.indices) {
        print(indice)
        println(": "+values[indice])
    }

    println("--------------------------------------------")
    println("For de indices ordenados crescente")
    values.sort()
    for (indice in values.indices) {
        print(indice)
        println(": "+values[indice])
    }

    println("--------------------------------------------")
    println("For de indices ordenados decrescente")
    values.sortDescending()
    for (indice in values.indices) {
        print(indice)
        println(": "+values[indice])
    }
}
