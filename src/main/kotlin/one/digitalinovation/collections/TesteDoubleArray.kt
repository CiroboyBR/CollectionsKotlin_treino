package one.digitalinovation.collections

fun main() {
    val salarios = DoubleArray(5)

    salarios[0] = 1500.0
    salarios[1] = 5000.0
    salarios[2] = 4000.0
    salarios[3] = 3500.0
    salarios[4] = 500.0

    salarios.forEach { println(it) }
    
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }
    println("Com acrescimo-------------------------------")
    salarios.forEach { println(it) }
    println("Ordenado Crescente-------------------------------")
    salarios.sort()
    salarios.forEach { println(it) }
    println("Ordenado Decrescente-------------------------------")
    salarios.sortDescending()
    salarios.forEach { println(it) }

    println("Usando doubleArrayOf-------------------------------")
    val salarios2 = doubleArrayOf(1400.0, 1200.0, 3000.0)
    salarios2.sort()
    salarios2.forEach { println(it) }
    
}