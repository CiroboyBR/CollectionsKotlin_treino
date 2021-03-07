package one.digitalinovation.collections

fun main() {
    val joao = Funcionario("joao", 3000.0, "CLT")
    val pedro = Funcionario("pedro", 4000.0, "PJ")
    val maria = Funcionario("Maria", 2000.0, "CLT")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach { println(it) }
    println(funcionarios.find { it.nome == "Maria" })
    println("sortedBy ----------------------------------")
    funcionarios.sortedBy { it.salario }.forEach { println(it) }
    println("groupBy ----------------------------------")
    funcionarios.groupBy { it.tipoContratacao }.forEach { println(it) }
}

