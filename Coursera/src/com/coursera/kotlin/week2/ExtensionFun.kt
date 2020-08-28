package com.coursera.kotlin.week2

fun main(args: Array<String>) {
    //  val sum = sum(listOf(1, 2, 3))
    val sum = listOf(1,2,3).sum()
    println(sum)    // 6
}

fun List<Int>.sum(): Int{
    var result = 0
    for (i in this) {
        result += i
    }
    return result
}