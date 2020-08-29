package com.ps.kotlin

import java.lang.NumberFormatException

fun main(){

    var number = "Four"
 // var number = 4


    var num: Int? = try {
        Integer.parseInt(number)
    }
    catch(e: NumberFormatException){
        null
    }

    println("Num is $num")
}