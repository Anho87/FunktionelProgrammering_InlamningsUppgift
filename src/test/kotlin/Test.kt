import AOC_2020_Dag_1.addThreeNumbers
import AOC_2020_Dag_1.addThreeNumbersWithLambda
import AOC_2020_Dag_1.addTwoNumbers
import AOC_2020_Dag_1.addTwoNumbersWithLambda
import AOC_2020_Dag_10.connectors
import AOC_2020_Dag_10.connectorsImproved
import AOC_2020_Dag_2.checkPasswords
import AOC_2020_Dag_2.checkPasswordsImproved
import AOC_2020_Dag_2.checkPasswordsPartTwo
import AOC_2020_Dag_2.checkPasswordsPartTwoImproved
import AOC_2020_Dag_6.yesCounter
import AOC_2020_Dag_6.yesCounterImproved
import AOC_2020_Dag_8.fixGame
import AOC_2020_Dag_8.fixGameImproved
import Vg_Del.Tomte
import Vg_Del.TomteHierarki
import Vg_Del.getUnderlings
import org.testng.Assert
import org.testng.annotations.Test


class Test {

    val tomteHierarki = TomteHierarki()
    val list: MutableList<Pair<Tomte, List<Tomte>>> = tomteHierarki.addTomteData()

    var uTomten: List<String> = mutableListOf(
        "Tröger", "Trötter", "Blyger", "Dammråttan", "Skumtomten", "Glader",
        "Butter", "Rådjuret", "Nyckelpigan", "Haren", "Räven", "Gråsuggan", "Myran", "Bladlusen"
    )
    var uGlader: List<String> = mutableListOf("Tröger", "Trötter", "Blyger", "Dammråttan", "Skumtomten")
    var uButter: List<String> = mutableListOf(
        "Rådjuret", "Nyckelpigan", "Haren", "Räven", "Gråsuggan", "Myran",
        "Bladlusen"
    )
    var uTrötter: List<String> = mutableListOf("Dammråttan", "Skumtomten")
    var uSkumtomten: List<String> = mutableListOf("Dammråttan")
    var uRäven: List<String> = mutableListOf("Gråsuggan", "Myran", "Bladlusen")
    var uMyran: List<String> = mutableListOf("Bladlusen")

    @Test
    fun dag10Test(){
        val list: MutableList<Int> = mutableListOf(28,33,18,42,31,14,46,20,48,47,24,23,49,45,19,38,39,11,1,32,25,35,8,17,7,9,4,2,34,10,3)
        list.sort()
        Assert.assertEquals(connectors(list),220)
        Assert.assertEquals(connectorsImproved(list),220)
    }
    @Test
    fun dag8Test() {
        val list: MutableList<String> = mutableListOf("nop +0","acc +1","jmp +4","acc +3","jmp -3","acc -99","acc +1","jmp -4","acc +6")
        Assert.assertEquals(fixGame(list,0), 5)
        Assert.assertEquals(fixGameImproved(list), 5)

    }

    @Test
    fun dag6Test() {
        val list: MutableList<String> = mutableListOf()
        list.add("abc")
        list.add("abc")
        list.add("abac")
        list.add("aaaa")
        list.add("b")
        Assert.assertEquals(yesCounter(list), 11)
        Assert.assertEquals(yesCounterImproved(list), 11)
    }

    @Test
    fun dag2Problem1Test() {
        val list: MutableList<String> = mutableListOf()
        list.add("1-3 a: abcde")
        list.add("1-3 b: cdefg")
        list.add("2-9 c: ccccccccc")
        Assert.assertEquals(checkPasswords(list), 2)
        Assert.assertEquals(checkPasswordsImproved(list), 2)
    }

    @Test
    fun dag2Problem2Test() {
        val list: MutableList<String> = mutableListOf()
        list.add("1-3 a: abcde")
        list.add("1-3 b: cdefg")
        list.add("2-9 c: ccccccccc")
        Assert.assertEquals(checkPasswordsPartTwo(list), 1)
        Assert.assertEquals(checkPasswordsPartTwoImproved(list), 1)
    }

    @Test
    fun dag1Problem1Test() {
        val list: MutableList<Int> = mutableListOf()
        list.add(1721)
        list.add(979)
        list.add(366)
        list.add(299)
        list.add(675)
        list.add(1456)
        Assert.assertEquals(addTwoNumbers(list), 514579)
        Assert.assertEquals(addTwoNumbersWithLambda(list), 514579)
    }

    @Test
    fun dag1Problem2Test() {
        val list: MutableList<Int> = mutableListOf()
        list.add(1721)
        list.add(979)
        list.add(366)
        list.add(299)
        list.add(675)
        list.add(1456)
        Assert.assertEquals(addThreeNumbers(list), 241861950)
        Assert.assertEquals(addThreeNumbersWithLambda(list), 241861950)
    }

    @Test
    fun tomtenTest() {
        Assert.assertEquals(getUnderlings("Tomten", list).size, uTomten.size)
    }

    @Test
    fun gladerTest() {
        Assert.assertEquals(getUnderlings("Glader", list).size, uGlader.size)
    }

    @Test
    fun butterTest() {
        Assert.assertEquals(getUnderlings("Butter", list).size, uButter.size)
    }

    @Test
    fun trötterTest() {
        Assert.assertEquals(getUnderlings("Trötter", list).size, uTrötter.size)
    }

    @Test
    fun skumtomtenTest() {
        Assert.assertEquals(getUnderlings("Skumtomten", list).size, uSkumtomten.size)
    }

    @Test
    fun rävenTest() {
        Assert.assertEquals(getUnderlings("Räven", list).size, uRäven.size)
    }

    @Test
    fun myranTest() {
        Assert.assertEquals(getUnderlings("Myran", list).size, uMyran.size)
    }

    @Test
    fun bladlusenTest() {
        Assert.assertEquals(getUnderlings("Bladlusen", list).size, 0)
    }

    @Test
    fun blygerTest() {
        Assert.assertEquals(getUnderlings("Blyger", list).size, 0)
    }

    @Test
    fun dammråttanTest() {
        Assert.assertEquals(getUnderlings("Dammråttan", list).size, 0)
    }

    @Test
    fun gråsugganTest() {
        Assert.assertEquals(getUnderlings("Gråsuggan", list).size, 0)
    }

    @Test
    fun harenTest() {
        Assert.assertEquals(getUnderlings("Haren", list).size, 0)
    }

    @Test
    fun nyckelpiganTest() {
        Assert.assertEquals(getUnderlings("Nyckelpigan", list).size, 0)
    }

    @Test
    fun rådjuretTest() {
        Assert.assertEquals(getUnderlings("Rådjuret", list).size, 0)
    }

    @Test
    fun trögerTest() {
        Assert.assertEquals(getUnderlings("Tröger", list).size, 0)
    }

}