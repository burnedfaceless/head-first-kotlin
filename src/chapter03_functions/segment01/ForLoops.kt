package chapter03_functions.segment01

fun main() {
    // print 1 to 100
    for (x in 1..100) println(x)
    // print 1 to 99
    for (x in 1 until 100) println(x)
    // print 15 to 1
    for (x in 15 downTo 1) println(x)
    // skip numbers
    for (x in 1..100 step 2) println(x)
    val array = arrayOf("Rock", "Paper", "Scissors")
    // loop through items in an array
    for (item in array) {
        println("$item is an item in the array")
    }
    // loop through an array's indices
    for (index in array.indices) {
        println("Index $index has item ${array[index]}")
    }
    // simplified way to loop through index and value
    for ((index, item) in array.withIndex()) {
        println("Index $index has item $item" )
    }
}