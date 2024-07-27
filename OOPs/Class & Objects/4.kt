/*
    Write a class Order with properties orderId, customerName, and a list of items. Add methods to add an item, remove an item, and calculate the total number of items.
*/

class Order(val orderId : Int, val customerName : String, val items : MutableList<String>) {
    fun addItem(item : String){
        items.add(item)
    }

    fun removeItem(item : String){
        items.remove(item)
    }

    fun listItems(){
        for(item in items){
            println(item)
        }
        println();
    }

    fun countItems(){
        println(items.size)
    }
}

fun main() {
    var order = Order(1, "Akhil", mutableListOf("Pizaa", "Burger", "Chips"))    
    println("Current All Items")
    order.listItems()
    
    order.addItem("Pepsi")
    println("After Item Add")
    order.listItems();
    
    order.removeItem("Burger")
    println("After Item Remove")
    order.listItems()
    
    println("Total Item Count")
    order.countItems()
}
