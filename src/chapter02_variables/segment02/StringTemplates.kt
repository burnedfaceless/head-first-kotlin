package chapter02_variables.segment02

fun main() {
    // prefix a variable with a dollar sign
    val x = 42
    println("Value of x is $x")
    // to refer to an object's properties, or to call its methods, use curly brackets
    val myArray = arrayOf(1, 2, 3)
    println("myArray has ${myArray.size} items")
    println("The first item is ${myArray[0]}")
    // you can also evaluate more complex expressions using string templates
    println("myArray is ${if (myArray.size > 10) "large" else "small"}")
}