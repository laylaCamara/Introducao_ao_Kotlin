fun main () {
    println("--->  A) <---")
    val num1: Int = 68
    val num2: Int = 86

    val soma =  num1 + num2
    println("A somas de $num1 e $num2 é igual a $soma! \n")

    println("---> B) <---")
    val expressaoB1 = 5 >3 && 2 < 4
    println("O resultado dessa expressão (5 > 3 && 2 < 4) é: $expressaoB1 \n")

    println("---> C) <---")
    val expressaoB2 = !(10 > 5 || 3 < 1)
    println("O resultado da expressão !(10 > 5 || 3 < 1) é: $expressaoB2")
}
