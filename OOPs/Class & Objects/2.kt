/*
Implement a class Employee with properties id, name, and salary. Add methods to increase and decrease the salary by a percentage.
*/

class Employee(val id : Int, val name : String, var salary : Double) {
    fun increaseSalary(percentage : Double){
        salary = salary + (salary * percentage / 100)
    }

    fun decreaseSalary(percentage : Double){
        salary = salary - (salary * percentage / 100)
    }
}   

fun main() {
    var employee = Employee(1, "Akhil", 10000.0)    

    println("Name : " + employee.name)
    employee.increaseSalary(10.0)
    println("Salary : " + employee.salary)

    employee.decreaseSalary(10.0)
    println("Salary : " + employee.salary)
}