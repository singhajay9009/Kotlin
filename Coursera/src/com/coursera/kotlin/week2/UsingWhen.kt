package com.coursera.kotlin.week2

fun main (){

    println(respondToInput("ui"))

}

fun respondToInput(input: String): String = when (input){
    "y", "yes" -> "I am glad"
    "n", "no" -> "Sorry"
    else -> "I dont understand"
}