/*
    Write an abstract class Employee with properties name and salary, and an abstract method calculateBonus(). Create subclasses Manager and Developer with additional properties and methods specific to each role. Implement calculateBonus() in each subclass.
*/

abstract class Employee(var name : String, var salary : Double){
    abstract fun calculateBonus()
}   

class Manager(name : String, salary : Double) : Employee(name, salary){
    override fun calculateBonus(){
        println("Manager bonus : " + salary * 0.1)
    }
}

class Developer(name : String, salary : Double) : Employee(name, salary){
    override fun calculateBonus(){
        println("Developer bonus : " + salary * 0.05)    
    }
}

fun main(){
    var manager = Manager("Akhil", 10000.0)
    manager.calculateBonus()

    println()

    var developer = Developer("Jaynesh", 15000.0)
    developer.calculateBonus()
}