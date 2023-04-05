fun main () {
    println("\n ---> 1. <---")
    print("Digite um número de 1 a 7: ")

    val semana = readln().toInt()

    when (semana) {
        1 -> println("Domindo")
        2 -> println("Segunda-feira")
        3 -> println("Terça-feira")
        4 -> println("Quarta-feira")
        5 -> println("Quinta-feira")
        6 -> println("Sexta-feira")
        7 -> println("Sábado")
        else -> println("Número incorreto!")
    }

    println("\n ---> 2. <---")
    print("Digite um animal: ")
    val animal = readln()
    when (animal) {
        "gato", "cachorro" -> println("Esse animal é um mamífero!")
        "tucano", "galinha" -> println("Esse animal é uma ave!")
        "cobra", "jacaré" -> println("Esse animal é um réptil!")
        else -> println("Não foi possível identificar o animal!")

    }


    println("\n ---> 3. <---")
    print("Digite uma letra: ")
    val letra = readln()

    when (letra) {
        "a", "A", "e","E", "i", "I", "o", "O", "u", "U" -> println("A letra $letra é uma vogal!")
        else -> println("A letra $letra é uma consoante!")
    }

    println("\n ---> 4. <---")
    print("Digite um número de 1 a 12: ")

    val mes = readln().toInt()

    when (mes) {
        1 -> println("Janeiro")
        2 -> println("Fevereiro")
        3 -> println("Março")
        4 -> println("Abril")
        5 -> println("Maio")
        6 -> println("Junho")
        7 -> println("Julho")
        8 -> println("Agosto")
        9 -> println("Setembro")
        10 -> println("Outubro")
        11 -> println("Novembro")
        12 -> println("Dezembro")
        else -> println("Número incorreto!")
    }

}