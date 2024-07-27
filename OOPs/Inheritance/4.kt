/*
    Create a class Vehicle with properties make and model, and a method displayInfo(). Implement derived classes Car and Bike that add properties specific to each vehicle type and override displayInfo() to include these additional details.
*/

open class Vehicle(var make : String, var model : String){
    open fun displayInfo(){
        println("Make : " + make)
        println("Model : " + model)
    }
}
class Car(make : String, model : String, var numDoors : Int) : Vehicle(make, model){
    override fun displayInfo(){
        super.displayInfo()
        println("Number of Doors : " + numDoors)
    }
}
class Bike(make : String, model : String, var numGears : Int) : Vehicle(make, model){
    override fun displayInfo(){
        super.displayInfo()
        println("Number of Gears : " + numGears)
    }    
}
fun main(){
    var car = Car("BMW", "X1", 4)
    car.displayInfo()

    println()

    var bike = Bike("HONDA", "Shine", 5)
    bike.displayInfo()
}