package com.ps.kotlin

import java.util.*

fun main() {

    for (i in 1..10){
        println("nums are: $i")
    }

    for (i in 1..10 step 2){
        println("nums are: $i")

    }

    for (i in 10 downTo 2 step 3){
        println("nums are $i")
    }

    var lst = listOf(1,2,3,4)

    for(ele in lst){
        println("--------------")
        println("item is: $ele")
    }

    var map = TreeMap<Int, String>();
    map[1] = "AJay"
    map[2] = "John"

    for((key, value) in map){
        println("-----------")
        println("Index is: $key --- Element is: $value")
    }

    println("==================================")

    // using list with index while iterating
    var lst1 = listOf(1,2,3,4)

    for((index,value) in lst1.withIndex()){
        println("index: $index || val: $value")

    }
}