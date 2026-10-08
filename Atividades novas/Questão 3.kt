package `Atividades novas`

fun validarBioInfantil(bio: String?) {
    val tamanho = bio?.length ?: 0


    if (tamanho <= 50) {
        println("Bio aceita")
    } else {
        println("Bio muito longa")
    }
}


fun main() {
    validarBioInfantil("Gosto de desenhos e joguinhos")
    validarBioInfantil(null)
    validarBioInfantil("Esta é uma biografia extremamente longa criada especialmente para ultrapassar o limite de 50 caracteres do perfil.")
}