package com.practice.coursera.modules.week3

fun main() {

    var s = "abc"

    var v = s as String
    println(s)

    var r = "2"
    println(r as? Int) // Here if it does not get casted in Int , it will return null -> so null in this case
  //  println(r as Int?) // here it will throw ClassCastException

    var e = null
    println(e as Int?)  // return null
}