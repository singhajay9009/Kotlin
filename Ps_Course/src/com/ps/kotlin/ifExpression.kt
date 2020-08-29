
fun main(){

    val u = UsingIf()

    // In Kotlin If is an expression, that mean you can assign the value returned by
    //if to a variable
    var status = if(u.age > 18) {
        "Adult"
    }
    else "Minor"

    print("Status is: ${status}")
}

class UsingIf{

    var age = 3
 //   var status = "Adult"
}