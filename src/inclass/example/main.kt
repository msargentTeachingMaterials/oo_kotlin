package inclass.example

fun main() {
    makeFish()
}

fun makeFish(){
    val shark = Shark()
    val pleco = Plecostomus()
    println("Shark: ${shark.color}")
    println("Plecostomus: ${pleco.color}")
    shark.eat()
    pleco.eat()
}


fun buildAquarium() {
    val myAquarium = Aquarium()
    myAquarium.printSize()
    val myTower = TowerTank(diameter = 20, height = 40)
    myTower.printSize()
}