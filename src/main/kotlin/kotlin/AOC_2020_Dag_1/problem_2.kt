package AOC_2020_Dag_1

import java.io.File

//AOC 2020 dag 1

fun main() {
    val dataList: List<Int> =
        File("src/main/kotlin/kotlin/AOC_2020_Dag_1/input").readLines().map { it.toInt() }
    println(addThreeNumbers(dataList))
}

fun addThreeNumbers(list: List<Int>): Int {
    for (i in list) {
        for (j in list) {
            for (k in list) {
                if (i + j + k == 2020) {
                    return i * j * k
                    
                }
            }
        }
    }
    return 0
}