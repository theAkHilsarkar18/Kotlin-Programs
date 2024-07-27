/*
    Write a base class Person with properties name and age. Create a derived class Employee that adds properties employeeId and department, and overrides a method displayDetails() to include these additional details.
*/

open class Person(var name : String, var age : Int){
    open fun displayDetails(){
        println("Name : " + name)
        println("Age : " + age)
    }
}

class Employee(name : String, age : Int, var employeeId : Int, var department : String) : Person(name, age){
    override fun displayDetails(){
        super.displayDetails()
        println("Employee Id : " + employeeId)
        println("Department : " + department)
    }
}

fun main(){
    var person = Person("Akhil", 18)
    person.displayDetails()

    println()

    var employee = Employee("Jaynesh", 22, 1818, "IT")
    employee.displayDetails()
}