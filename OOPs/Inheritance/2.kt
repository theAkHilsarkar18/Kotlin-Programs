/*
    Implement a class Shape with a method area(). Create derived classes Circle and Square that override the area() method to calculate and return the area of the respective shapes. Add properties radius to Circle and side to Square.
*/

open class Shape (){
    open fun area(){
        println("Shape area")
    }
}
class Circle(var radius : Double) : Shape(){
    override fun area(){
        println("Area of circle: " + 3.14 * radius * radius)
    }
}    
class Square(var side : Double) : Shape(){
    override fun area(){
        println("Area of square: " + side * side)
    }
}
fun main(){
    var circle = Circle(10.0)
    circle.area()

    println()

    var square = Square(10.0)
    square.area()
}