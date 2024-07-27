/*
    Write a Kotlin program that throws a custom exception InvalidAgeException if a user's age is less than 18. Handle the exception and display an appropriate message. Add a method to log the exception details to a file.
*/

class InvalidAgeException(message: String) : Exception(message) 

fun main() {
    try {
        val age = 15
        if (age < 18) {
            throw InvalidAgeException("You are not eligible to vote.")
        } else {
            println("You are eligible to vote.")
        }
    } catch (e: InvalidAgeException) {
        println("Exception: ${e.message}")
    }
}