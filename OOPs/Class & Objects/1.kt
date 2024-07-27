/* Create a Kotlin class Person with properties name and age,
and a method printDetails that prints the person's details.
Add a secondary constructor that initializes the name with
"Unknown" if not provided. */

class Person(val name : String, val age : Int) {
    fun printDetails(){
        println("Name : " + name)
        println("Age : " + age)
    }
}

fun main() {
    var person = Person("Akhil", 22)
    person.printDetails()
}   