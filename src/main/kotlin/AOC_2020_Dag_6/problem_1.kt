package AOC_2020_Dag_6

import java.io.File

fun main(){
    val dataList: List<String> =
        File("src/main/kotlin/AOC_2020_Dag_6/input").readLines()
            .joinToString("\n")
            .split("\n\n").map { it.replace("\n","") }
    
    println(yesCounter(dataList))
}
fun yesCounter(list: List<String>):Int{
    var counter = 0
    for (i in list){
        val mySet = i.toSet()
        counter += mySet.size
    }
    return counter
}