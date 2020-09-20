package nicestring

fun String.isNice(): Boolean {



    val noBadString = setOf("ba", "be", "bu").none{this.contains(it)}

    val hasThreeVowels = this.count { it in "aeiou"} >= 3

    val hasDouble = this.zipWithNext().any { it.first == it.second }
    var flag: Int = 0
    if (noBadString) flag++
    if (hasThreeVowels) flag++
    if ( hasDouble) flag++
    return flag>1

    /*
    // This was original Solution //
    val caseOne = doesNotMatchIllegalPattern(this)
    val caseTwo = containsDoubleLetter(this)
    val caseThree = containsVowelCount(this)
    var flag: Int = 0
    if (caseOne) flag++
    if (caseTwo) flag++
    if ( caseThree) flag++
    return flag>1

     */


}
    
/*fun doesNotMatchIllegalPattern(str: String): Boolean {
    val list = listOf("bu", "ba", "be")
    return !list.any{it -> str.contains(it) }
}*/

val doesNotMatchIllegalPattern: (String) -> Boolean =  { str: String ->
    val list = listOf("bu", "ba", "be")
    !list.any { it ->
        str.contains(it)
    }
}

/*fun containsVowelCount( str: String): Boolean{
    val list = listOf('a', 'e', 'i', 'o', 'u')
    return str.filter{it -> list.contains(it)}.length > 2
}*/

val containsVowelCount = { str: String ->
    val list = listOf('a', 'e', 'i', 'o', 'u')
    str.filter{it -> list.contains(it)}.length > 2
}


/*
fun containsDoubleLetter (str: String): Boolean {
    return str.any{it -> str.contains(it.toString().plus(it))}
}*/

val containsDoubleLetter = { str: String ->
    str.any{it -> str.contains(it.toString().plus(it))}
}



// This is Solution 2

fun String.checkSolution(): Boolean {

    val noBadString = setOf("ba", "be", "bu").none{this.contains(it)}

    val hasThreeVowels = this.count { it in "aeiou"} > 2

    val hasDouble = this.zipWithNext().any { it.first == it.second }

    return true;
}
