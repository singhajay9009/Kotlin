package com.ps.kotlin

fun main() {

    var txt = "Multiple      white     \t whitespace"

    println(txt)

    println(replaceMultipleWhiteSpace(txt))

    println(txt.replaceMultipleWhiteSpaceEx())
}

// This fun trims multiple whitespace into a signle in a String
fun replaceMultipleWhiteSpace(str: String): String{
    var regEx = Regex("\\s+")
    return regEx.replace(str, " ")
}

// This is Extension Fun. 'this' refers to value of
// receiver on which this fucntion will be called upon
fun String.replaceMultipleWhiteSpaceEx(): String{
    var regEx = Regex("\\s+")
    return regEx.replace(this, " ")
}