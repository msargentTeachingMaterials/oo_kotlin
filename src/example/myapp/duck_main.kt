package example.myapp

fun main(){
    var daffy: Duck = Duck(NormalFly())
    daffy.performFly()

    println("Daffy eats a magic mushroom")
    daffy.flyingBehavior = RocketFly()
    daffy.performFly()
}
