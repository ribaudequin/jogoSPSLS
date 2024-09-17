//logica

fun gerarComputador(): String {
    val opcoes = listOf("papel", "pedra", "tesoura", "lagarto", "spock")
    val indice = (0..4).random()
    return opcoes[indice]
}

fun quemGanhou(jogador: String, computador: String) {
    // TODO: adicionar o resto da logica
    println(mensagem(jogador, computador))
    readln()
    voltaOuMenu()
}