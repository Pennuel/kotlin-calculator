/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

// the operations for the t
val ADD ="+"
val SUBTRACT= "-"
val MULTIPLY ="*"
val DIVIDE="/"

val ERROR_MESSAGE = "an error occured"
// this test for the function to work
val testOperandOne = 5.0
val testOperandTwo = 4.0

// enter the arguement( =,-,*,/)
fun main(args: Array<String>){
    val operatorSymbol = args[0]
    
    start(operatorSymbol)
    
}

fun start(operatorSymbol: String){
    if (checkArguements(operatorSymbol)){
        evaluateBinomial(testOperandOne, testOperandTwo,operatorSymbol)
    }else{
        displayResult(ERROR_MESSAGE)
    }
}

// this will return a boolean value
fun checkArguements(operatorSymbol:String): Boolean{
   return when(operatorSymbol){
        //equals
        ADD-> true
        SUBTRACT-> true
        DIVIDE ->  true
        MULTIPLY -> true
       // not equal
       else ->false
    }
}
// this function calculates the value to be printed
fun evaluateBinomial(testOperandOne: Double, testOperandTwo: Double,Sym: String):String{
      return when(Sym){
        //equals
        ADD-> (testOperandOne+testOperandTwo).toString()
        SUBTRACT->(testOperandOne-testOperandTwo).toString()
        DIVIDE ->  (testOperandOne/testOperandTwo).toString()
        MULTIPLY -> (testOperandOne*testOperandTwo).toString()
       // not equal
       else -> ERROR_MESSAGE
    }
 }
// single expression snipets for single line code
fun displayResult(result:String)= System.out.println(result)
