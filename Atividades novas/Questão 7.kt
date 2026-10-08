package `Atividades novas`

fun limparBancoDeDados(emails: List<String?>) {
    var contasInvalidas = 0

    for (email in emails) {
        val tamanho = email?.length ?: 0

        if (email == null || tamanho == 0) {
            contasInvalidas++
            println("Aviso: Conta com e-mail inválido/nulo será deletada.")
        } else {
            println("Conta válida: $email")
        }
    }

    println("Total de contas que precisam ser apagadas: $contasInvalidas")
}

fun main() {
    val listaEmails = listOf("usuario@email.com", null, "", "cliente@empresa.com", " ")
    limparBancoDeDados(listaEmails)
}