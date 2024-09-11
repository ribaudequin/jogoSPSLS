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
    // TODO:
}

fun iniciarJogo() {
    // TODO:
}

fun sair() {
    return
}