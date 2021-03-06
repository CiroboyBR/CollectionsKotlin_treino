package one.digitalinovation.collections

fun main() {
    val values = IntArray(5)

    values[0] = 5
    values[1] = 4
    values[2] = 2
    values[3] = 3
    values[4] = 1

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
