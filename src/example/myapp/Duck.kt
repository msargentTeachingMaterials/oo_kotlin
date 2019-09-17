package example.myapp

class Duck(var flyingBehavior: FlyingBehavior) {
    fun performFly(){
        flyingBehavior.fly()
    }
}

class NormalFly: FlyingBehavior{
    override fun fly() {
        println("Flying like a duck")
    }
}

class RocketFly: FlyingBehavior{
    override fun fly(){
        println("Flying like a duck strapped to a rocket")
    }
}

interface FlyingBehavior{
    fun fly()
}