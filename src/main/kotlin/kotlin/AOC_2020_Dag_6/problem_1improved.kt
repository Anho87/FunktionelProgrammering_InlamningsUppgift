package AOC_2020_Dag_6

import java.io.File

//https://www.reddit.com/r/adventofcode/comments/k52psu/2020_day_06_solutions/
//Jag tog inspiration från användare scott-mcc-1, killermelga, martingaston 
//och även https://todd.ginsberg.com/post/advent-of-code/2020/day6/
//

fun main(){
    val dataList: List<String> =
        File("src/main/kotlin/kotlin/AOC_2020_Dag_6/input").readLines()
            .joinToString("\n")
            .split("\n\n").map { it.replace("\n","") }
    println(yesCounterImproved(dataList))
}
fun yesCounterImproved(list: List<String>):Int{
    return list.sumOf { it.toSet().size }
}