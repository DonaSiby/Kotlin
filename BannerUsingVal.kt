/**************************************
Author:Dona Siby
Title :To create a border.
Date  :03/06/2021
***************************************/
fun main() {
    val border = "%"
    printBorder(border)
    println("Happy Birthday, Jhansi!")
    printBorder(border)
}

fun printBorder(border: String) {
    repeat(23) {
        print(border)
    }
    println()
}
