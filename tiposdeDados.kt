fun main () {
    println("Tipos de dados \n")

    println("A) --- É preciso utilizar o dado 'Double' para números decimais ---")
    val numD: Double = 10.57
    println("Meu número decimal é: $numD \n")

    println("B) --- É preciso utilizar o dado 'String' para texto, e o 'Int' para números inteiros! ---")
    val dTexto: String = "Oiee!"
    println("Meu texto é: $dTexto")

    val numI: Int = 16
    println("Meu número inteiro é: $numI \n")

    println("C) --- É preciso utilizar o dado 'Int' para números inteiros, e o 'Double' para números decimais! ---")
    val numInteiro: Int = 10
    val numDecimal: Double = 2.21
    println("Meu número inteiro é: $numInteiro")
    println("Meu número decimal é: $numDecimal")
}