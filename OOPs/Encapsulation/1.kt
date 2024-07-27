/*
    Create a Kotlin class BankAccount with private properties accountNumber and balance. Provide public methods to get the balance, deposit money, and withdraw money with validation to ensure sufficient funds.
*/

class BankAccount(private val accountNumber : Int, private var balance : Double) {
    fun getBalance() : Double {
        return balance
    }   

    fun deposit(amount : Double){
        balance += amount
    }   

    fun withdraw(amount : Double){
        if(amount > balance){
            println("Insufficient funds")
        }else{
            balance -= amount
        }
    }   
}

fun main() {
    var account = BankAccount(123, 1000.0)  
    
    println("default balance")
    println("Balance : " + account.getBalance() + "\n")

    println("after deposit")
    account.deposit(500.0)
    println("Balance : " + account.getBalance() + "\n")

    
    println("after withdraw")
    account.withdraw(15000.0)
    println("Balance : " + account.getBalance() + "\n")
}