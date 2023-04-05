fun main () {
    println("\n ---> 1. <---")

    print("Digite a priemira nota: ")
    val n1 = readln().toDouble()

    print("Digite a segunda nota: ")
    val n2 = readln().toDouble()

    val m = (n1 + n2) / 2

    if (m >= 7) {
        println("Aprovado com média de $m!")
    } else {
        println("Reprovado! com a média de $m")
    }

    println("\n---> 2. <---")
    print("Digite um número: ")
    val num = readln().toInt()

    if (num % 2 == 0) {
        println("O número $num é par!")
    } else {
        println("O número $num é ímpar")
    }

    println("\n---> 3. <---")

    print("Digite um número: ")
    val numero = readln().toInt()

    if (numero > 0) {
        println("O número $numero é positivo!")
    } else if (numero < 0) {
        println("O número $numero é negativo!")
    } else {
        println("O número $numero é zero!")
    }


    println("\n---> 4. <---")

    print("Digite sua idade: ")
    val idade = readln().toInt()

    if (idade >= 18) {
        println("Você tem $idade anos, então é maior de idade!")
    } else {
        println("Você tem $idade anos, então é menor de idade!")
    }

}










