/*
    Define an abstract class Payment with an abstract method processPayment(). Implement subclasses CreditCardPayment, DebitCardPayment, and PayPalPayment that provide specific implementations for the method. Add properties amount and currency to the Payment class.
*/

abstract class Payment(var amount : Double, var currency : String){
    abstract fun processPayment()
}   

class CreditCardPayment(amount : Double, currency : String) : Payment(amount, currency){
    override fun processPayment(){
        println("Processing credit card payment " + amount + " " + currency)
    }
}

class DebitCardPayment(amount : Double, currency : String) : Payment(amount, currency){
    override fun processPayment(){
        println("Processing debit card payment " + amount + " " + currency)
    }
}

class PayPalPayment(amount : Double, currency : String) : Payment(amount, currency){
    override fun processPayment(){
        println("Processing PayPal payment " + amount + " " + currency)
    }
}   

fun main(){
    var payment = CreditCardPayment(1000.0, "USD")
    payment.processPayment()

    println()

    var payment2 = DebitCardPayment(1500.0, "RS")
    payment2.processPayment()

    println()

    var payment3 = PayPalPayment(1100.0, "USD")
    payment3.processPayment()
}