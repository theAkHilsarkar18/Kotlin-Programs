/*
    Write a Kotlin program that handles an ArithmeticException when dividing a number by zero. Display a user-friendly message if an exception occurs. Add logging to capture the exception details.
*/

fun main(){
    try{
        var a = 10
        var b = 0
        var c = a/b
        println("Result : " + c)
    }catch(e : ArithmeticException){
        println("Exception : " + e)
    }
}