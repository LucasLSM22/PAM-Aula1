package fundamentos

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args: Array<String>){
    val num1: Int = 2
    val num2: Int = 3
    val maiorValor = if (num1 > num2){
        println("Processando...")
        num1
    }    else{
        println("Processando...")
        num2
    }
    println("O maior valor é $maiorValor")
}