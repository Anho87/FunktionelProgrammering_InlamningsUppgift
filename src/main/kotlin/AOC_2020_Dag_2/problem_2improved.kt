package AOC_2020_Dag_2

import java.io.File

//https://www.reddit.com/r/adventofcode/comments/k52psu/2020_day_02_solutions/
//Jag tog inspiration från användare Necropolictic, vini_2003 och carrdinal-dnb
//och även https://todd.ginsberg.com/post/advent-of-code/2020/day2/
//
fun main() {
    val dataList: List<String> =
        File("src/main/kotlin/AOC_2020_Dag_2/input").readLines()

    println(checkPasswordsPartTwoImproved(dataList))

}

fun checkPasswordsPartTwoImproved(list: List<String>): Int {
    val regex = """(\d+)-(\d+) (.): (\w+)""".toRegex()
    var counter = 0
    list.forEach {
        regex.find(it)?.let { matchResult ->
            val (firstNumber, secondNumber, letter, password) = matchResult.destructured
            if ((password.getOrNull(firstNumber.toInt() - 1) == letter.single())
                xor (password.getOrNull(secondNumber.toInt() - 1) == letter.single())) {
                counter++
            }
        }
    }
    return counter
}