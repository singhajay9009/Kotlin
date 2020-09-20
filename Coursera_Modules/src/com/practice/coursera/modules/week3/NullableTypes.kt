package com.practice.coursera.modules.week3

fun main() {
    //   println("hello World")

    var x: String? = null // x can take null as well
    //Note that type of x above is not String but "Nullable String"
    //
    println(x?.length)   // if x is null then null will be printed

    //*** uncomment below line ****//
    //  println(x.length) // compile time error as x can be null as well

    var x1: String? = "kotlin"
    //println(x1.length) // Illegal operation as x1 can be null as well
    println(x1?.length)  // legal operation  ? refers "safe access" operator

    var y: String? = null
    if (y != null) {
        var length = y.length
    }else{
        var length = null
    }

    //or in 1 line //
    var length = if (y!=null) y.length else null

    //     OR  we can do it without using If by using "safe-access" operator    //
    var length1 = y?.length   //( lenght1 would become null or y.length)

    var len: Int = y?.length ?: 0 // if y is not null then return y.length
    // but if y is null, then instead returning null , now it will return 0
    // ?: is called "Elvis operator"

    y!!.length // will throw NPE if y is null
    y?.length // will return value null if y is null
}
