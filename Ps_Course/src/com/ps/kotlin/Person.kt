package com.ps.kotlin

class Person {

    var name: String = "John"

    fun displayWithLambda(func: (s: String) -> Unit){
        func(name)
    }
}