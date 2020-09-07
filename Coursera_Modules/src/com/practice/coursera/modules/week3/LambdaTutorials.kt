package com.practice.coursera.modules.week3

// some important concepts about lambda type
fun main() {

    /*
    val f1: ()-> Int? = null  // compiler gives error as f1 is of type lambda
    // which either returns Int or null, so we cant store null in it

    val f2: () -> Int? = { null } // correct -> As it points to lambda which returns null

    val f3: (() -> Int)? = null // correct -> as f3 refers to a lambda or to null

    val f4: (() -> Int)? = {null} // wrong -> as f4 points to a lambda which returns to int//
    // or it points to null, but here we tried to store a lambda {null} which is wrong

    // an imp point on how to call f3 here

    if( f3 != null ) {
        f3()
    }

    ///   or    /// we can also using invoke to call a method

    f3?.invoke() // calling with safe access
    // each variable of function type can be called using invoke
     */
}