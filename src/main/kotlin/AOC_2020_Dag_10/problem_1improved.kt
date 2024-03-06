package AOC_2020_Dag_10

import java.io.File

//https://www.reddit.com/r/adventofcode/comments/ka8z8x/2020_day_10_solutions/
//Jag tog inspiration från användare uex, carrdinal-dnb, VictiniX888
//och även https://todd.ginsberg.com/post/advent-of-code/2020/day10/
//

fun main() {
    val dataList: MutableList<Int> =
        File("src/main/kotlin/AOC_2020_Dag_10/input").readLines().map { it.toInt() }.toMutableList()
    dataList.sort()
    println(connectorsImproved(dataList))
}

fun connectorsImproved(list: MutableList<Int>): Int {
    var oneJolt = 0
    var threeJolt = 1
    
    if (list[0] - 0 == 1) oneJolt++ else threeJolt++

    list.zipWithNext()
        .map { (it.second - it.first) }.groupBy { it }
        .forEach { (difference, amount) ->
            if (difference == 1) oneJolt  += amount.size else threeJolt += amount.size
        }
    return oneJolt * threeJolt
}