package Vg_Del


fun getUnderlings(currentName: String, res: MutableList<Pair<Tomte, List<Tomte>>>): MutableList<String> {
    val tomteNamn: MutableList<String> = mutableListOf()
    res.forEach { (tomte, underTomtar) ->
        if (tomte.name == currentName) {
            underTomtar.forEach { underTomte ->
                tomteNamn.add(underTomte.name)
            }
            underTomtar.forEach { underTomte ->
                tomteNamn.addAll(getUnderlings(underTomte.name, res))
            }
        }
    }
    return tomteNamn
}

fun main() {
    val tomteHierarki = TomteHierarki()
    val list: MutableList<Pair<Tomte, List<Tomte>>> = tomteHierarki.addTomteData()
    println(getUnderlings("Räven", list))
}