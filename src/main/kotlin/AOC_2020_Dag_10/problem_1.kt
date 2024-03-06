package AOC_2020_Dag_10


import java.io.File

fun main() {
    val dataList: MutableList<Int> =
        File("src/main/kotlin/AOC_2020_Dag_10/input").readLines().map { it.toInt() }.toMutableList()
    dataList.sort()
    println(connectors(dataList))
}

fun connectors(list: MutableList<Int>):Int{
    var oneJolt = 0
    var threeJolt = 1
    fun calculateDifference(firstNumber: Int, secondNumber: Int) = if (secondNumber - firstNumber == 1) oneJolt++ else threeJolt++
    calculateDifference(0,list[0])
    for (i in 0..<list.size - 1){
        calculateDifference(list[i],list[i + 1])
    }
    return oneJolt * threeJolt
}