package inclass.example

open class Aquarium(open var length: Int = 100, open var width: Int = 20, open var height: Int = 40) {
    open var volume: Int
        get() = width * height * length /1000
        set(value){
            height = (value * 1000) / (width * length)
        }
    open var water: Double = 0.0
        get() = volume * 0.9

    open val shape = "rectangle"

    init {
        println("aquarium initializing")
    }

    constructor(numberOfFish: Int) : this() {
        // 2,000 cm^3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1
    }

    fun printSize() {
        println(
            "Width: $width cm " +
            "Length: $length cm " +
            "Height: $height cm ")

        println("Volume: $volume liters $water liters (${water/volume*100} % full)")
    }
}