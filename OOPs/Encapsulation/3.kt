/*
    Write a Kotlin class Product with private properties productId and price. Add methods to get the price and set a new price with validation to ensure it is not negative. Add a method to apply a discount to the price.
*/

class Product(val productId : Int, private var price : Double) {
    fun getPrice() : Double {
        return price
    }  

    fun setPrice(price : Double){
        if(price >= 0){
            this.price = price
        }else{
            println("Invalid price")
        }
    }

    fun applyDiscount(discount : Double){
        price = price - (price * discount / 100)
    }
}

fun main() {
    var product = Product(1, 100.0)

    println("default price");
    println("Price : " + product.getPrice() + "\n")
    
   
    product.setPrice(200.0)
    println("After Set Price")
    println("Price : " + product.getPrice() + "\n")

    
    product.applyDiscount(10.0)
    println("After Discount")
    println("Price : " + product.getPrice() + "\n")
}