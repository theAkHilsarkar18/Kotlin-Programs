// Use a loop to generate and print the first 10 Fibonacci numbers.

fun main() {
    var first = 0
    var second = 1
    var sum = 0
    var i : Int = 1;
    
    print(" " + first + " ")
    print(second)
    while(i<=10)
    {
        sum = first + second
        print(" " + sum)
        first = second
        second = sum
        i++
	}
}
