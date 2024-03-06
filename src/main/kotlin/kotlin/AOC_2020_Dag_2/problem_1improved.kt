package AOC_2020_Dag_2

import java.io.File
//https://www.reddit.com/r/adventofcode/comments/k52psu/2020_day_02_solutions/
//Jag tog inspiration från användare vini_2003, ephemient och carrdinal-dnb
//och även https://todd.ginsberg.com/post/advent-of-code/2020/day2/
//

fun main() {
    val dataList: List<String> =
        File("src/main/kotlin/kotlin/AOC_2020_Dag_2/input").readLines()
    println(checkPasswordsImproved(dataList))
}

fun checkPasswordsImproved(list: List<String>): Int {
    val regex = """(\d+)-(\d+) (.): (\w+)""".toRegex()
    var counter = 0
    for (i in list) {
        val matchResult = regex.find(i)
        if (matchResult != null) {
            val (firstNumber, secondNumber, letter, password) = matchResult.destructured
            if (password.count { it.toString() == letter } in firstNumber.toInt()..secondNumber.toInt()) counter++
        }
    }
    return counter
}