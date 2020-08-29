package com.ps.kotlin

fun main() {

    // by putting ? below we instruct that val c can be null as well
    // Later while using c we can additionally check on any property if it is null of not
    var c: Car? = Car()


    if(c != null){
        print("make: ${c.make} --- brand: ${c.brand}")
    }

    // with below ? we are checking that perform the operation only if c is not null,
    //else dont perform c.make
    if(c?.make == "1978"){
        println ( "make is established yr.")
    }


    c = null

    if(c!=null){
        println("c is not null. Value of c: ${c}")
    }
    else{
        println("c is null. Vlsue of c: ${c}")
    }
}

class Car {

    var make = "1978"
    var brand = "Mercedez"
}