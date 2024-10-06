//logica

fun gerarComputador(): String {
    val opcoes = listOf("papel", "pedra", "tesoura", "lagarto", "spock")
    val indice = (0..4).random()
    return opcoes[indice]
}

fun quemGanhou(jogador: String, computador: String) {
    println(mensagem(jogador, computador))


    if (jogador == computador) {
        println("O ${Globalvariables.nome} empatou ${simbolos.empate.code} com o computador ${simbolos.computador.code}")
    } else if (jogador == "pedra" && (computador == "tesoura" || computador == "lagarto")) {
        println("O ${Globalvariables.nome} ganhou ${simbolos.pedra.code} ao computador ${simbolos.computador.code}")
    } else if (jogador == "papel" && (computador == "pedra" || computador == "spock")) {
        println("O ${Globalvariables.nome} ganhou ${simbolos.papel.code} ao computador ${simbolos.computador.code}")
    } else if (jogador == "tesoura" && (computador == "papel" || computador == "lagarto")) {
        println("O ${Globalvariables.nome} ganhou ${simbolos.tesoura.code} ao computador ${simbolos.computador.code}")
    } else if (jogador == "lagarto" && (computador == "spock" || computador == "papel")) {
        println("O ${Globalvariables.nome} ganhou ${simbolos.lagarto.code} ao computador ${simbolos.computador.code}")
    } else if (jogador == "spock" && (computador == "tesoura" || computador == "pedra")) {
        println("O ${Globalvariables.nome} ganhou ${simbolos.spock.code} ao computador ${simbolos.computador.code}")
    } else {
        println("O computador ${simbolos.computador.code} ganhou ${simbolos.valueOf(computador).code} ao ${Globalvariables.nome}")
    }

    voltaOuMenu()
}



fun jogador() {
    println("Qual seu nome?")
    Globalvariables.nome = readlnOrNull()
}


object  Globalvariables {
    var nome: String? = null
}

