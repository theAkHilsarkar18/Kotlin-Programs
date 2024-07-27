/*
Create a class Library with a property books (a list of strings). Add methods to add a book, remove a book, and list all books, and create ascending order as per book name.
*/

class Library(val books : MutableList<String>) {
    fun addBook(book : String){
        books.add(book)
    }

    fun removeBook(book : String){
        books.remove(book)
    }

    fun listBooks(){
        for(book in books){
            println(book)
        }
        println();
    }

    fun sortBooks(){
        books.sort()
    }  
}

fun main() {
    var library = Library(mutableListOf("Book1", "Book2", "Book3"))
    println("Current All Books")
    library.listBooks()
    
    library.addBook("Book4")
    println("After Book Add")
    library.listBooks();
    
    library.removeBook("Book3")
    println("After Book Remove")
    library.listBooks()
    
    println("Sorted Book List")
    library.sortBooks()
    library.listBooks()
}