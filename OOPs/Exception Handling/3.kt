/*
Create a Kotlin function that opens a file and reads its contents. Use try-catch blocks to handle potential IOException and print an error message. Ensure the file is closed properly using a finally block.
 */

import java.io.File
import java.io.IOException
import java.util.*

fun main() {
    try {    
        val file = File("input.txt")
        val scanner = Scanner(file)
        while (scanner.hasNextLine()) {
            val line = scanner.nextLine()
            println(line)
        }
        scanner.close()
    } catch (e: IOException) {
        println("An error occurred while reading the file: ${e.message}")
    } finally {
        println("File closed")
    }
}