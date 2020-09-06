package com.coursera.kotlin.week2


fun main(args: Array<String>) {fun isValidIdentifier(s: String): Boolean {
    fun isValidCharacter(ch: Char): Boolean= ch == '_' ||
            ch in 'a'..'z' ||
            ch in 'A'..'Z' ||
            ch in '0'..'9'
    for (ch in s){
        if (!isValidCharacter(ch)) return false
    }
    return (s.isNotEmpty() && !s[0].isDigit())
}
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}