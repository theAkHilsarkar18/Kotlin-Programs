/*
    Create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter(). Implement Rectangle and Triangle classes that provide concrete implementations for these methods. Add appropriate properties to each class.
*/
abstract class Shape{
    abstract fun calculateArea()
    abstract fun calculatePerimeter()
}
class Rectangle(var length : Double, var width : Double) : Shape(){
    override fun calculateArea(){
        println("Area of rectangle: " + length * width)
    }
    override fun calculatePerimeter(){
        println("Perimeter of rectangle: " + 2 * (length + width))
    }
}
class Triangle(var base : Double, var height : Double) : Shape(){
    override fun calculateArea(){
        println("Area of triangle: " + 0.5 * base * height)
    }
    override fun calculatePerimeter(){
        println("Perimeter of triangle: " + 3 * base)
    }
}
fun main(){
    var rectangle = Rectangle(10.0, 5.0)
    rectangle.calculateArea()
    rectangle.calculatePerimeter()

    println()

    var triangle = Triangle(20.0, 8.0)
    triangle.calculateArea()
    triangle.calculatePerimeter()
}