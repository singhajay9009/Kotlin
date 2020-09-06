package com.coursera.kotlin.week2

enum class Color {
    BLUE, ORANGE, RED
}
fun main () {

    print(getDescription(Color.ORANGE))

}

fun getDescription(color : Color): String = when(color){
        Color.BLUE -> "I am Blue"
        Color.ORANGE -> "I am orange"
        Color.RED -> "I am red"
    }
