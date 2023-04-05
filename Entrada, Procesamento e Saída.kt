fun main () {
    println("Entrada, Processamento e Saída \n")
    println("\n ---> 1. <---")

    print("Digite um número: ")
    val num1 = readln().toInt()

    print("Digite outro número: ")
    val num2 = readln().toInt()

    val soma = num1 + num2

    println(soma)

    println(" \n ---> 2. <---")

    print("Digite um número: ")
    val a = readln().toDouble()
    val quadrado = a * a

    println("O valor do quadrado é $quadrado \n")

    println(" \n ---> 3. <---")

    print("Digite seu nome: ")
    val nome = readln()

    print("Digite sua idade: ")
    val idade = readln().toInt()

    println("Oi, $nome! Seja muito bem-vindo(a)! Você tem $idade anos, certo? :)")

}