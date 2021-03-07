package one.digitalinovation.collections

fun main() {
    val joao = Funcionario("joao", 3000.0, "CLT")
    val pedro = Funcionario("pedro", 4000.0, "PJ")
    val maria = Funcionario("Maria", 2000.0, "CLT")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach{ println(it) }

    println("---------------------------")
    funcionarios.add(pedro)
    funcionarios.forEach{ println(it) }

    println("---------------------------")
    funcionarios.remove(joao)
    funcionarios.forEach{ println(it) }

    println("-------------SET--------------")
    val funcionariosSet = mutableSetOf(joao)
    funcionarios.forEach{ println(it) }

    println("-------------SET--------------")
    funcionariosSet.add(pedro)
    funcionariosSet.remove(joao)
    funcionarios.forEach{ println(it) }
}