/*
    Implement a method in Kotlin that reads an integer from the user and handles NumberFormatException if the input is not a valid integer. Display an error message and prompt the user to enter the value again.
*/

import java.lang.NumberFormatException
fun main(){
    try{
        var a = readLine()!!.toInt()
        println("Value : " + a)
    }catch(e : NumberFormatException){
        println("Exception : " + e)
    }
}