fun main() {
  
  
    //val is a special word used by Kotlin, called a keyword, indicating that what follows is the name of a variable.
    //age is the name of the variable.
    //A variable declared using the val keyword can only be set once. You cannot change its value later in the program.
  
    val age = 5 * 365
    val name = "Rover"
    
    println("Happy Birthday, ${name}!")
    
    // Let's print a cake!
    println("   ,,,,,   ")
    println("   |||||   ")
    println(" =========")
    println("@@@@@@@@@@@")
    println("{~@~@~@~@~}")
    println("@@@@@@@@@@@")
    
    //Instead of printing text, the system needs to print the value of the variable.
    //You do this by putting your variable inside curly braces preceded by a dollar sign, like in the example below.
    //${variable}
    println("")

    println("You are already ${age} days old, ${name}!")
    println("${age} days old is the very best age to celebrate!")
}
