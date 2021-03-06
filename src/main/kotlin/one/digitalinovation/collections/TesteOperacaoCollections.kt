package one.digitalinovation.collections

fun main() {
    val salarios = doubleArrayOf(1200.0, 1400.0, 3000.0, 1100.0, 2200.0)
    salarios.forEach { println(it) }

    println("------------------")
    println("Maior Salario: ${salarios.max()}")
    println("Menor Salario: ${salarios.min()}")
    println("Media Salarial: ${salarios.average()}")


    val salarioAlto = salarios.filter { it > 2000.0 }
    println("------------------")
    salarioAlto.forEach{println(it)}

}