package com.ps.kotlin

@JvmOverloads
fun printLog(logMsg: String, logLevel: Int = 1){
    println("$logMsg -- $logLevel")
}