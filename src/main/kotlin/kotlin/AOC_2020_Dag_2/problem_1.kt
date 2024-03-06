package AOC_2020_Dag_2

import java.io.File

//AOC_2020_DAG_2
fun main() {
    val dataList: List<String> =
        File("src/main/kotlin/kotlin/AOC_2020_Dag_2/input").readLines()
    println(checkPasswords(dataList))
}

fun checkPasswords(list: List<String>):Int {
    val splitList = list.map { inputString ->
        inputString.split(":").map { it.trim() }
    }
    var counter = 0;
    for (i in list.indices) {
        val parts = splitList[i][0].split("-", " ")
        val firstNumber = parts[0].toInt()
        val secondNumber = parts[1].toInt()
        val letter = parts[2]
        val count = splitList[i][1].count { it.toString() == letter }
        if (count >= firstNumber && count <= secondNumber){
            counter++
        }
    }
    return counter
}