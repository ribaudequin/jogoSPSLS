fun main() {
    menu()
}


fun menu() {
    println("##########################################################")
    println("# Bem vindo ao jogo Papel, Pedra, Tesoura Lagarto, Spock #")
    println("##########################################################")
    println("#         Escolha uma das opções abaixo:                 #")
    println("##########################################################")
    println("# 1 - Regras do jogo                                     #")
    println("# 2 - Iniciar o jogo                                     #")
    println("# 3 - Sair                                               #")
    println("##########################################################")
    println("#                    ${simbolos.Papel.code} ${simbolos.Pedra.code} ${simbolos.Tesoura.code} ${simbolos.Lagarto.code} ${simbolos.Spock.code}                      #")

    val opcao = readlnOrNull()

    when (opcao) {
        "1" -> regras()
        "2" -> iniciarJogo()
        "3" -> sair()
        else -> {
            println("Opcão inválida. Pressione ENTER para tentar novamente.")
            readln()
            menu()
        }
    }
}

fun regras() {
    println("##########################################################")
    println(" Regras do jogo:                                          ")
    println(" Tesoura ✂\uFE0F corta papel \uD83D\uDCF0                 ")
    println(" Papel \uD83D\uDCF0 cobre pedra \uD83E\uDEA8              ")
    println(" Pedra \uD83E\uDEA8 esmaga lagarto \uD83E\uDD8E           ")
    println(" Lagarto \uD83E\uDD8E envenena Spock \uD83D\uDD96         ")
    println(" Spock \uD83D\uDD96 Vaporiza tesoura ✂\uFE0F              ")
    println(" Tesoura ✂\uFE0F decapita lagarto \uD83E\uDD8E            ")
    println(" Lagarto \uD83E\uDD8E come papel \uD83D\uDCF0             ")
    println(" Papel \uD83D\uDCF0 desmente Spock \uD83D\uDD96           ")
    println(" Spock \uD83D\uDD96 destrói pedra \uD83E\uDEA8            ")
    println(" Pedra \uD83E\uDEA8 parte tesoura ✂\uFE0F                 ")
    println("##########################################################")

    voltaOuMenu()
}

fun iniciarJogo() {
    println("Escolha Papel, Pedra, Tesoura, Lagarto ou Spock")
    val escolhaJogador = readlnOrNull()   // lembrar para por em lowercase  <---------- IMPORTANTE

    if (escolhaJogador == null) {
        println("Opcão inválida. Pressione ENTER para tentar novamente.")
        readln()
        iniciarJogo()
    }

    val escolhaComputador = gerarComputador()

    quemGanhou(escolhaJogador!!, escolhaComputador)

}

fun sair() {
    return
}

fun voltaOuMenu() {
    println("Pressione ENTER para voltar ao menu.")
    readln()
    menu()
}

fun mensagem(opcao1: String, opcao2: String): String {
    when {
        opcao1 == "tesoura" && opcao2 == "papel" || opcao1 == "papel" && opcao2 == "tesoura" ->
            return "Tesoura ${simbolos.Tesoura.code} corta papel ${simbolos.Papel.code}"
        opcao1 == "papel" && opcao2 == "pedra" || opcao1 == "pedra" && opcao2 == "papel" ->
            return "Papel ${simbolos.Papel.code} cobre pedra ${simbolos.Pedra.code}"
        opcao1 == "pedra" && opcao2 == "lagarto" || opcao1 == "lagarto" && opcao2 == "pedra" -> return "Pedra esmaga lagarto"
        opcao1 == "lagarto" && opcao2 == "spock" || opcao1 == "spock" && opcao2 == "lagarto" -> return "Lagarto envenena Spock"
        opcao1 == "spock" && opcao2 == "tesoura" || opcao1 == "tesoura" && opcao2 == "spock" -> return "Spock Vaporiza tesoura"
        opcao1 == "tesoura" && opcao2 == "lagarto" || opcao1 == "lagarto" && opcao2 == "tesoura" -> return "Tesoura decapita lagarto"
        opcao1 == "lagarto" && opcao2 == "papel" || opcao1 == "papel" && opcao2 == "lagarto" -> return "Lagarto come papel"
        opcao1 == "papel" && opcao2 == "spock" || opcao1 == "spock" && opcao2 == "papel" -> return "Papel desmente Spock"
        opcao1 == "spock" && opcao2 == "pedra" || opcao1 == "pedra" && opcao2 == "spock" -> return "Spock destrói pedra"
        opcao1 == "pedra" && opcao2 == "tesoura" || opcao1 == "tesoura" && opcao2 == "pedra" -> return "Pedra parte tesoura"
        else -> return "Empate"
    }
}



enum class simbolos(val code: String) {
    Papel("\uD83D\uDCF0"),
    Pedra("\uD83E\uDEA8"),
    Tesoura("✂\uFE0F"),
    Lagarto("\uD83E\uDD8E"),
    Spock("\uD83D\uDD96");
}






