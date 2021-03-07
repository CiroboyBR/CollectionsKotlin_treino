package one.digitalinovation.collections

fun main() {
    val joao = Funcionario("joao", 3000.0, "CLT")
    val pedro = Funcionario("pedro", 4000.0, "PJ")
    val maria = Funcionario("Maria", 2000.0, "CLT")

    val funcionariosMasculinos = setOf(joao, pedro)
    val funcionariosFemininos = setOf(maria)

    val funcionariosTodos = funcionariosMasculinos.union(funcionariosFemininos)
    funcionariosTodos.forEach { println(it) }

    println("subtract --------------------------")
    val funcionariosSubtraidos = funcionariosTodos.subtract(funcionariosFemininos)
    funcionariosSubtraidos.forEach { println(it) }

    println("intersect --------------------------")
    val uniao = funcionariosTodos.intersect(funcionariosFemininos)
    uniao.forEach { println(it) }
}