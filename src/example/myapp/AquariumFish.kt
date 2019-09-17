package example.myapp

//abstract class AquariumFish {
//    abstract val color: String
//}

interface FishColor {
    val color: String
}

object GoldColor : FishColor {
    override var color = "gold"
}


class Shark: FishAction, FishColor by GoldColor {
    override fun eat() {
        println("Hunt and eat whatever unfortunate creature it finds")
    }

//    override val color = "gray"
}



//class Plecostomus(fishColor: FishColor = GoldColor):  FishAction,
//    FishColor by fishColor {
//    override fun eat() {
//        println("eat algae")
//    }
//}

//class Plecostomus(fishColor: FishColor = GoldColor):  FishAction,
//    FishColor by fishColor {
//    override fun eat() {
//        println("eat algae")
//    }
//}

class Plecostomus (fishColor: FishColor = GoldColor):
    FishAction by PrintingFishAction("eat algae"),
    FishColor by fishColor

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}


//class Plecostomus: FishAction, FishColor by GoldColor {
//    override fun eat() {
//       println("Eats algae")
//    }
////    override val color = "gold"
//}

interface FishAction  {
    fun eat()
}
