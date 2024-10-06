enum class simbolos(val code: String) {
    Papel("\uD83D\uDCF0"),
    Pedra("\uD83E\uDEA8"),
    Tesoura("✂\uFE0F"),
    Lagarto("\uD83E\uDD8E"),
    Spock("\uD83D\uDD96");
}

fun mensagem(opcao1: String, opcao2: String): String {
    when {
        opcao1 == "tesoura" && opcao2 == "papel" || opcao1 == "papel" && opcao2 == "tesoura" ->
            return "Tesoura ${simbolos.Tesoura.code} corta papel ${simbolos.Papel.code}"
        opcao1 == "papel" && opcao2 == "pedra" || opcao1 == "pedra" && opcao2 == "papel" ->
            return "Papel ${simbolos.Papel.code} cobre pedra ${simbolos.Pedra.code}"
        opcao1 == "pedra" && opcao2 == "lagarto" || opcao1 == "lagarto" && opcao2 == "pedra" ->
            return "Pedra ${simbolos.Pedra.code} esmaga lagarto ${simbolos.Lagarto.code}"
        opcao1 == "lagarto" && opcao2 == "spock" || opcao1 == "spock" && opcao2 == "lagarto" ->
            return "Lagarto ${simbolos.Lagarto.code} envenena Spock ${simbolos.Spock.code}"
        opcao1 == "spock" && opcao2 == "tesoura" || opcao1 == "tesoura" && opcao2 == "spock" ->
            return "Spock ${simbolos.Spock.code} Vaporiza tesoura ${simbolos.Tesoura.code}"
        opcao1 == "tesoura" && opcao2 == "lagarto" || opcao1 == "lagarto" && opcao2 == "tesoura" ->
            return "Tesoura ${simbolos.Tesoura.code} decapita lagarto ${simbolos.Lagarto.code}"
        opcao1 == "lagarto" && opcao2 == "papel" || opcao1 == "papel" && opcao2 == "lagarto" ->
            return "Lagarto ${simbolos.Lagarto.code} come papel ${simbolos.Papel.code}"
        opcao1 == "papel" && opcao2 == "spock" || opcao1 == "spock" && opcao2 == "papel" ->
            return "Papel ${simbolos.Papel.code} desmente Spock ${simbolos.Spock.code}"
        opcao1 == "spock" && opcao2 == "pedra" || opcao1 == "pedra" && opcao2 == "spock" ->
            return "Spock ${simbolos.Spock.code} destrói pedra ${simbolos.Pedra.code}"
        opcao1 == "pedra" && opcao2 == "tesoura" || opcao1 == "tesoura" && opcao2 == "pedra" ->
            return "Pedra ${simbolos.Pedra.code} parte tesoura ${simbolos.Tesoura.code}"
        else -> return "Empate"
    }
}

