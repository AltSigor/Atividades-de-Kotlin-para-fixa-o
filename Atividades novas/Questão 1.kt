package `Atividades novas`
fun main(){
    fun calcularDesconto(valor: Double, cupom: String?): Double {
        return when (cupom) {
            "PROMO10" -> valor - 10.0
            "PROMO20" -> valor - 20.0
            else -> valor
        }
    }

    fun main() {
        val valorProduto = 100.0

        val resultado1 = calcularDesconto(valorProduto, "PROMO10")
        println("Cupom PROMO10: R$ $resultado1")

        val resultado2 = calcularDesconto(valorProduto, "PROMO20")
        println("Cupom PROMO20: R$ $resultado2")

        val resultado3 = calcularDesconto(valorProduto, "INVALIDO")
        println("Cupom Inválido: R$ $resultado3")

        val resultado4 = calcularDesconto(valorProduto, null)
        println("Cupom Nulo: R$ $resultado4")
    }




}

