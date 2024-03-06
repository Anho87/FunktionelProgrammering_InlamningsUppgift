package AOC_2020_Dag_1

import java.io.File

//AOC 2020 dag 1
//https://www.reddit.com/r/adventofcode/comments/k4e4lm/2020_day_1_solutions/
//Jag tog inspiration från användare KamcaHorvat och vini_2003
//och även från https://todd.ginsberg.com/post/advent-of-code/2020/day1/
//
fun main() {
    val dataList: List<Int> =
        File("src/main/kotlin/AOC_2020_Dag_1/input").readLines().map { it.toInt() }
    
    println(addThreeNumbersWithLambda(dataList))
}

fun addThreeNumbersWithLambda(list: List<Int>):Int{
    list.forEach { value1 ->
        list.forEach { value2 ->
            list.forEach { value3 ->
                if (value1 + value2 + value3 == 2020) {
                    return value1 * value2 * value3
                } 
            }
        }
    }
    return 0
}


