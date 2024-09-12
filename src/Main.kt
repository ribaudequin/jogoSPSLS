fun main() {
    menu()
}



fun menu () {
    println("##########################################################")
    println("# Bem vindo ao jogo Papel, Pedra, Tesoura Lagarto, Spock #")
    println("##########################################################")
    println("#         Escolha uma das opções abaixo:                 #")
    println("##########################################################")
    println("# 1 - Regras do jogo                                     #")
    println("# 2 - Iniciar o jogo                                     #")
    println("# 3 - Sair                                               #")
    println("##########################################################")

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
    println(" Regras do jogo:                                        ")
    println(" Tesoura ✂\uFE0F corta papel \uD83D\uDCF0               ")
    println(" Papel \uD83D\uDCF0 cobre pedra \uD83E\uDEA8            ")
    println(" Pedra \uD83E\uDEA8 esmaga lagarto \uD83E\uDD8E          ")
    println(" Lagarto \uD83E\uDD8E envenena Spock \uD83D\uDD96     ")
    println(" Spock \uD83D\uDD96 Vaporiza tesoura ✂\uFE0F       ")
    println(" Tesoura ✂\uFE0F decapita lagarto \uD83E\uDD8E          ")
    println(" Lagarto \uD83E\uDD8E come papel \uD83D\uDCF0       ")
    println(" Papel \uD83D\uDCF0 desmente Spock \uD83D\uDD96           ")
    println(" Spock \uD83D\uDD96 destrói pedra \uD83E\uDEA8          ")
    println(" Pedra \uD83E\uDEA8 parte tesoura ✂\uFE0F       ")
    println("##########################################################")

    println("Pressione ENTER para voltar ao menu.")
    readln()
    menu()
}

fun iniciarJogo() {
    // TODO:
}

fun sair() {
    return
}