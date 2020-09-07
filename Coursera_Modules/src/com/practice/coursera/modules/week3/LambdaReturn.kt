package com.practice.coursera.modules.week3

fun main() {
foo(listOf(1,0, 3, 2,0))
foo2(listOf(2,4,0,4,0))
}

fun foo(list: List<Int>) {
    list.forEach{
        if(it == 0 )  return
        println(it)
    }
    print ("######")
}

fun foo2(list: List<Int>) {
    list.forEach{
        if(it == 0 )  return@forEach
        println(it)
    }
    print ("######")
}