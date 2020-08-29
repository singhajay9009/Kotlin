package com.ps.kotlin

fun main(args: Array<String>){

    val q = Question()

    // Accessing the property under the hood create setter and getter
    q.isApplicable = true
    q.sample = "Are you married?"

    println( "Applicability: ${q.isApplicable} .... question is: ${q.sample}")

    q.display()
}

class Question{

    var isApplicable = false
    var sample = "How many kids do you have?"

    fun display() {
        println ("Applicability: ${isApplicable} .... question is: ${sample}" )
    }
}