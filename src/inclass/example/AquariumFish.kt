package inclass.example


interface FishAction{
    fun eat()
}

interface FishColor{
    val color:String
}

object GoldColor: FishColor{
    override val color: String
        get() = "gold"
}

class PrintingFishAction(val food: String): FishAction{
    override fun eat() {
        println(food)
    }

}

data class Decoration(val rocks: String, val wood: String, val diver: String)

class Shark(): FishAction{
    override fun eat() {
        println("The shark is hunting and eating whatever unfortunate creature it finds")
    }
}

class Plecostomus(fishColor: FishColor = GoldColor): FishAction by PrintingFishAction("Bottomfeed"), FishColor by fishColor