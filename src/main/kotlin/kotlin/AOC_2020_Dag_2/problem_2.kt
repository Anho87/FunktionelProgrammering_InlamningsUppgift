package AOC_2020_Dag_2

import java.io.File

fun main() {
    val dataList: List<String> =
        File("src/main/kotlin/kotlin/AOC_2020_Dag_2/input").readLines()

    println(checkPasswordsPartTwo(dataList))

}

fun checkPasswordsPartTwo(list: List<String>): Int {
    val regex = """(\d+)-(\d+) (.): (\w+)""".toRegex()
    var counter = 0
    for (i in list) {
        val line = regex.find(i)
        if (line != null) {
            val (firstNumber, secondNumber, letter, password) = line.destructured
            if ((password.getOrNull(firstNumber.toInt() - 1) == letter.single())
                xor (password.getOrNull(secondNumber.toInt() - 1) == letter.single())) counter++
        }
    }
    return counter
}