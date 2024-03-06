package AOC_2020_Dag_1

import java.io.File

//AOC 2020 dag 1
//https://www.reddit.com/r/adventofcode/comments/k4e4lm/2020_day_1_solutions/
//Jag tog inspiration från användare schwiz
//
fun main() {
    val dataList: List<Int> =
        File("src/main/kotlin/AOC_2020_Dag_1/input").readLines().map { it.toInt() }.sorted()

    println(addTwoNumbersWithLambda(dataList))
}

fun addTwoNumbersWithLambda(list: List<Int>): Int {
    for (i in list){
        if (list.contains(2020 - i)){
            return i * (2020 - i)
        }
    }
    return 0
}