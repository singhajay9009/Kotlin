package com.coursera.kotlin.week2



enum class Color2 {
    BLUE, ORANGE, RED, PURPLE, BLACK
}

fun main () {
   // print(mix(Color2.ORANGE, Color2.PURPLE )); // dirty color

    print(mix(Color2.ORANGE, Color2.BLACK)) //
}

fun mix (c1: Color2, c2: Color2) = when (setOf(c1, c2)){
    setOf(Color2.ORANGE, Color2.BLUE) -> Color.BLUE
    setOf(Color2.ORANGE, Color2.BLACK) -> Color2.BLACK
    setOf(Color2.RED, Color2.PURPLE) -> Color2.ORANGE
    else -> throw Exception("dirty color")
}