package AOC_2020_Dag_1

import java.io.File

//AOC 2020 dag 1

fun main() {
    val dataList: List<Int> =
        File("src/main/kotlin/AOC_2020_Dag_1/input").readLines().map { it.toInt() }
   
    println(addTwoNumbers(dataList))
}

fun addTwoNumbers(list: List<Int>): Int {
    var numbers = 0

    for (i in 0 until list.size - 1) {
        for (j in i + 1 until list.size) {
            val addedNumbers = list[i] + list[j]
            if (addedNumbers == 2020) {
                numbers = (list[i] * list[j])
            }
        }
    }
    return numbers
}