/*
    Create a simple base class Animal with a method sound(). Implement derived classes Dog, Cat, and Cow that override the sound() method with appropriate animal sounds. Add an eat() method to the base class and override it in each derived class with specific behavior.
*/

open class Animal {
    open fun sound(){
        println("Animal sound")
    }

    open fun eat(){
        println("Animal eat")    
    }
}

class Dog : Animal() {
    override fun sound(){
        println("Dog sound")
    }

    override fun eat(){
        println("Dog eat")
    }
}

class Cat : Animal() {
    override fun sound(){
        println("Cat sound")
    }

    override fun eat(){
        println("Cat eat")    
    }
}

class Cow : Animal() {
    override fun sound(){
        println("Cow sound")
    }   

    override fun eat(){ 
        println("Cow eat")
    }
}

fun main() {
    var dog = Dog()
    dog.sound()
    dog.eat()
    
    println()
    
    var cat = Cat()
    cat.sound()
    cat.eat()
    
   	println()

    var cow = Cow()
    cow.sound()
    cow.eat()
}

