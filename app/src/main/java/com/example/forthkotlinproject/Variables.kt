package com.example.forthkotlinproject

//val - immutable, cannot be changed once give a value
//var- mutable
fun main() {
    val popcorn = 5 //read-only
    var cats = 6 // mutable

    cats = 5
//        popcorn = 4  // Error as its immutable
    println(cats)
    print(popcorn)
}

//NB: Variables can be declared outside the main() function at the beginning of your program. Variables declared in this way are said to be declared at top level.