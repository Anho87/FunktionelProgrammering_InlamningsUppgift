package AOC_2020_Dag_8

import java.io.File

var accCounter = 0
var checkIfAlreadyBeenthere: MutableList<Int> = mutableListOf()
fun main() {
    val dataList: List<String> =
        File("src/main/kotlin/AOC_2020_Dag_8/input").readLines()
    println(fixGame(dataList, 0))
}

fun fixGame(list: List<String>, position: Int): Int {
    
    if (checkIfAlreadyBeenthere.size > 0) {
        if (checkIfAlreadyBeenthere.contains(position)) {
            return accCounter
        } else {
            checkIfAlreadyBeenthere.add(position)
            val regex = Regex("([a-zA-Z]+) ([-+])(\\d+)")
            val splitString = regex.find(list[position])
            if (splitString != null) {
                val (operation, sign, number) = splitString.destructured
                when (operation) {
                    "acc" ->
                        if (sign.equals("+")) {
                            accCounter += number.toInt()
                            fixGame(list, position + 1)
                        } else if (sign.equals("-")) {
                            accCounter -= number.toInt()
                            fixGame(list, position + 1)
                        }
                    "nop" ->
                        fixGame(list, position + 1)
                    "jmp" ->
                        if (sign.equals("+")) {
                            fixGame(list, position + number.toInt())
                        } else if (sign.equals("-")) {
                            fixGame(list, position - number.toInt())
                        }
                }
            }
        }

    } else {
        checkIfAlreadyBeenthere.add(position)
        val regex = Regex("([a-zA-Z]+) ([-+])(\\d+)")
        val splitString = regex.find(list[position])
        if (splitString != null) {
            val (operation, sign, number) = splitString.destructured
            when (operation) {
                "acc" ->
                    if (sign.equals("+")) {
                        accCounter += number.toInt()
                        fixGame(list, position + 1)
                    } else if (sign.equals("-")) {
                        accCounter -= number.toInt()
                        fixGame(list, position + 1)
                    }

                "nop" ->
                    fixGame(list, position + 1)
                "jmp" ->
                    if (sign.equals("+")) {
                        fixGame(list, position + number.toInt())
                    } else if (sign.equals("-")) {
                        fixGame(list, position - number.toInt())
                    }
            }
        }
    }
    return accCounter
}
