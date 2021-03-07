package one.digitalinovation.collections

fun main() {
    val salarios = doubleArrayOf(1200.0, 1400.0, 3000.0, 1100.0, 2200.0)
    salarios.forEach { println(it) }

    println("------------------")
    println("Maior Salario: ${salarios.maxOrNull()}")
    println("Menor Salario: ${salarios.minOrNull()}")
    println("Media Salarial: ${salarios.average()}")


    val salarioAlto = salarios.filter { it > 2000.0 }
    println("------------------")
    salarioAlto.forEach { println(it) }

    println("------------------")
    println(salarios.count { it in 2000.0..5000.0 })
    println("Igual a 3000 ------------------")
    println(salarios.find { it == 3000.0 })
    println("Diferente de 3000 ------------------")
    println(salarios.find { it != 3000.0 })
    println("Tem algum elemento igual a 3k? ------------------------")
    println(salarios.any { it == 3000.0 })
    println("Tem algum elemento igual a 9k? ------------------------")
    println(salarios.any { it == 9000.0 })


}