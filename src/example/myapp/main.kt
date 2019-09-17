package example.myapp

fun main() {
//    buildAquarium()
    makeFish()
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()


    println("Shark: ${shark.color}")
    println("Plecostomus: ${pleco.color}")
    shark.eat()
    pleco.eat()
}

fun buildAquarium() {
    val myAquarium = Aquarium(width = 25, length = 25, height = 40)
    myAquarium.printSize()
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()

}