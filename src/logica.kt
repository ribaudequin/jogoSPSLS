//logica

fun gerarComputador(): String {
    val opcoes = listOf("papel", "pedra", "tesoura", "lagarto", "spock")
    val indice = (0..4).random()
    return opcoes[indice]
}

fun quemGanhou(jogador: String, computador: String) {
    println(mensagem(jogador, computador))


    if (jogador == computador) {
        println("O jogador empata ${simbolos.empate.code} com o computador")
    } else if (jogador == "pedra" && (computador == "tesoura" || computador == "lagarto")) {
        println("O jogador ganhou ${simbolos.pedra.code} ao computador")
    } else if (jogador == "papel" && (computador == "pedra" || computador == "spock")) {
        println("O jogador ganhou ${simbolos.papel.code} ao computador")
    } else if (jogador == "tesoura" && (computador == "papel" || computador == "lagarto")) {
        println("O jogador ganhou ${simbolos.tesoura.code} ao computador")
    } else if (jogador == "lagarto" && (computador == "spock" || computador == "papel")) {
        println("O jogador ganhou ${simbolos.lagarto.code} ao computador")
    } else if (jogador == "spock" && (computador == "tesoura" || computador == "pedra")) {
        println("O jogador ganhou ${simbolos.spock.code} ao computador")
    } else {
        println("O computador ganhou ${simbolos.valueOf(computador).code} ao Jogador")
    }

    voltaOuMenu()
}


