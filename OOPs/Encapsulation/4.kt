/*
    Create a class Rectangle with private properties length and width. Provide public methods to calculate and return the area and perimeter of the rectangle. Add methods to set the length and width with validation to ensure they are positive.
*/

class Rectangle(private var length : Double, private var width : Double) {
    fun getArea() : Double {
        return length * width
    }

    fun getPerimeter() : Double {
        return 2 * (length + width)
    }

    fun setLength(length : Double){
        if(length >= 0){
            this.length = length
        }else{
            println("Invalid length")
        }
    }

    fun setWidth(width : Double){
        if(width >= 0){
            this.width = width
        }else{
            println("Invalid width")
        }
    }
}

fun main() {
    var rectangle = Rectangle(10.0, 5.0)
    
    println("default area")
    println("Area : " + rectangle.getArea() + "\n")
    
    println("default perimeter")
    println("Perimeter : " + rectangle.getPerimeter() + "\n")
    
    rectangle.setLength(20.0)
    rectangle.setWidth(10.0)
    println("after change : " + "\n")

    println("Area : " + rectangle.getArea())
    println("Perimeter : " + rectangle.getPerimeter() + "\n")
}