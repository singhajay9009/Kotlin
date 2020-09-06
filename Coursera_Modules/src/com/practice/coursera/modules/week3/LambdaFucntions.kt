package com.practice.coursera.modules.week3

fun main(){

    // type of variable 'sum' is a lambda here - (Int, Int) -> Int
    // note that type of sum is not 'Int', instead a lambda
    val sum: (Int, Int) -> Int = {x, y -> x+y}

    // type of result is 'Int' as is the type of value returned by lambda expression 'sum;
    val result = sum(3,4)
    println(result)

    usinglambdaAsParam()

    lambdaFilter()
}

fun usinglambdaAsParam() {

    val isEven = {i:Int -> i%2 == 0}

    val list = listOf(1,2,3,4)

    println(list.any(isEven))

    println(list.filter(isEven))
}

fun lambdaFilter(){

    val list = listOf(5, 10, 23,25,34)

    val isMultipleOfFive = {
        i:Int -> i%5 == 0
    }

    val result = list.filter(isMultipleOfFive)
    println(result)

    /////     or     /////

    val result2 = list.filter { i: Int -> i % 5 == 0 }

    println(result2)
}