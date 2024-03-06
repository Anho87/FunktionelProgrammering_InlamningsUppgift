package AOC_2020_Dag_8

import java.io.File

//https://www.reddit.com/r/adventofcode/comments/k8xw8h/2020_day_08_solutions/
//Jag tog inspiration från användare AOC_2020, nutrecht, Divyak120
//och även https://todd.ginsberg.com/post/advent-of-code/2020/day8/
//

var accCounterImproved = 0
var checkIfAlreadyBeenthereImproved = mutableSetOf<Int>()
var position = 0
fun main() {
    val dataList: List<String> =
        File("src/main/kotlin/AOC_2020_Dag_8/input").readLines()
    println(fixGameImproved(dataList))
}

fun fixGameImproved(list: List<String>): Int {
    while (true){
        if (checkIfAlreadyBeenthereImproved.contains(position)) return accCounterImproved
        checkIfAlreadyBeenthereImproved.add(position)
        val regex = Regex("([a-zA-Z]+) ([-+])(\\d+)")
        val splitString = regex.find(list[position])
        if (splitString != null) {
            val (operation, sign, number) = splitString.destructured
            val value = if (sign == "+") number.toInt() else -number.toInt()
            when (operation) {
                "acc" -> {
                    accCounterImproved += value
                    position ++
                }
                "nop", "jmp" -> if (operation == "jmp") position += value else position++
            }
        }
    }
}
