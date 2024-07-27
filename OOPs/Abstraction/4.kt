/*
    Implement an abstract class Device with an abstract method turnOn(). Create concrete classes Laptop and Smartphone that override the method to print device-specific messages. Add properties brand and model to the Device class.
*/

abstract class Device(var brand : String, var model : String){
    abstract fun turnOn()
}

class Laptop(brand : String, model : String) : Device(brand, model){
    override fun turnOn(){
        println("Laptop turned on")
    }
}

class Smartphone(brand : String, model : String) : Device(brand, model){
    override fun turnOn(){
        println("Smartphone turned on")
    }
}

fun main(){
    var laptop = Laptop("Apple", "MacBook Pro")
    laptop.turnOn()

    println()

    var smartphone = Smartphone("Samsung", "Galaxy S10")
    smartphone.turnOn()
}