package com.ps.kotlin

fun main (args : Array<String>){
    var person = Person()
    //print(person)

    person.name = "Steve"

    println("Name is ${person.name}")

    var clssWithConstructor = ClassWithConstructor("black")
    println("prop is ${clssWithConstructor.prop}")




    person.displayWithLambda (::printName)
}


fun printName(name: String): Unit{
    println("Name is ${name}")
}