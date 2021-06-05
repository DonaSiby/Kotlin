/******************************************************
Author:Dona Siby
Title :To create a border.
Date  :03/06/2021
*******************************************************/
fun main() {
    printBorder()
    println("Happy Birthday, Dawn!")
    printBorder()
}

//In the printBorder() method, use a repeat() statement to print the equal sign 23 times.
//Instead of using println(), use print(), so that you do not jump to a new line after printing each "=".

fun printBorder() {
    repeat(23) {
        print("=")
    }
    println()
}
