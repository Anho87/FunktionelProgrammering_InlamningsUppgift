package Vg_Del

class TomteHierarki {
    
    
    fun addTomteData(): MutableList<Pair<Tomte, List<Tomte>>>{
        val tomteLista: MutableList<Pair<Tomte, List<Tomte>>> = mutableListOf()
        val tomte1 = Tomte("Tomten")
        val tomte2 = Tomte("Glader")
        val tomte3 = Tomte("Butter")
        val tomte4 = Tomte("Tröger")
        val tomte5 = Tomte("Trötter")
        val tomte6 = Tomte("Blyger")
        val tomte7 = Tomte("Rådjuret")
        val tomte8 = Tomte("Nyckelpigan")
        val tomte9 = Tomte("Haren")
        val tomte10 = Tomte("Räven")
        val tomte11 = Tomte("Skumtomten")
        val tomte12 = Tomte("Dammråttan")
        val tomte13 = Tomte("Gråsuggan")
        val tomte14 = Tomte("Myran")
        val tomte15 = Tomte("Bladlusen")
        tomteLista.add(tomte1 to listOf(tomte2,tomte3))
        tomteLista.add(tomte2 to listOf(tomte4,tomte5,tomte6))
        tomteLista.add(tomte3 to listOf(tomte7,tomte8,tomte9,tomte10))
        tomteLista.add(tomte5 to listOf(tomte11))
        tomteLista.add(tomte11 to listOf(tomte12))
        tomteLista.add(tomte10 to listOf(tomte13,tomte14))
        tomteLista.add(tomte14 to listOf(tomte15))
        
        
        
        return tomteLista
    }
}