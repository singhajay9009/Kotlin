package com.ps.javaProgram;

//import com.ps.kotlin.DisplayFunKt;

import com.ps.kotlin.DefaultParametersKt;
import com.ps.kotlin.DisplayFunctions;

import javax.swing.*;

public class App {
    public static void main(String[] args) {

       // Kotlin File can be called with same name as it was created like below
       // DisplayFunKt.display("Hello Kotlin. This is Java!");

        //but if you have explicitly defined file name using @annotation @file,
        //then it would be called like below
        DisplayFunctions.display("Hello Kotlin. This is java!");

        // Calling with just one param and ignoring 2nd is valid here
        // because we are using @JvmLoads in the respective kotlin file
        DefaultParametersKt.printLog("This is sample log msg");

        DefaultParametersKt.printLog("This is log", 2);
    }
}
