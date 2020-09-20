package mastermind

data class Evaluation(val rightPosition: Int, val wrongPosition: Int)

fun evaluateGuess(secret: String, guess: String): Evaluation {

    var rPosition = 0
    var wPosition = 0
    val secretChars = secret.toCharArray()
    val guessChars = guess.toCharArray()

    var mapSecret = mutableMapOf<Char, MutableList<Int>> ()

    for(i in 0 until secretChars.size){
        if(!mapSecret.containsKey(secretChars.get(i))) {
            mapSecret[secretChars.get(i)] =  mutableListOf(i)
        }else{
            var lst = mapSecret.getValue(secretChars.get(i))
            lst.add(i)
        }
    }

    var mapGuess = mutableMapOf<Char, MutableList<Int>> ()
    for(i in 0 until guessChars.size){
        if(!mapGuess.containsKey(guessChars.get(i))) {
            mapGuess[guessChars.get(i)] =  mutableListOf(i)
        }else{
            var lst = mapGuess.getValue(guessChars.get(i))
            lst.add(i)
        }
    }

    fun checkPositions(c:Char){
        var lstGuess = mapGuess.getValue(c)
        var lstSecret = mapSecret.getValue(c)

        var lstRemoveItems:MutableList<Int> = mutableListOf()

        for (k in lstGuess){
            if(lstSecret.contains(k)){
                rPosition++
                lstRemoveItems.add(k)
            }
        }

        lstGuess.removeAll(lstRemoveItems)
        lstSecret.removeAll(lstRemoveItems)

        if(lstGuess.size <= lstSecret.size) wPosition = wPosition + lstGuess.size
        else wPosition = wPosition + lstSecret.size
        mapSecret.remove(c)
    }


    for(i in 0 until guessChars.size){
        if(mapSecret.containsKey(guessChars.get(i))){
            checkPositions(guessChars.get(i))
        }
    }

    return Evaluation(rPosition, wPosition)

}


