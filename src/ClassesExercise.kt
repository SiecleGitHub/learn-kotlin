class Car1(make: String, model: String, var color: String) : Vehicle1(make, model) {
    override fun details() {
        println("I am a $color $make $model")
    }
}

class Truck1(make: String, model: String, var towingCapacity: Int) : Vehicle1(make, model) {
    fun tow() {
        println("tow away")
    }

    override fun accelerate() {
        println("Going fast")
    }

    override fun details() {
        println("I am a $make $model and can tow away $towingCapacity")
    }
}


open class Vehicle1 (val make: String, val model: String) {
    open fun accelerate() {
        println("vrooom vroom")
    }

    fun brake() {
        println("STOP")
    }

    open fun details() {

    }
}

fun main(args: Array<String>) {
    val mycar = Car1("Toyota", "Avalon", "red")
    mycar.details()
    mycar.accelerate()

    mycar.brake()
    val truck = Truck1("Ford", "F-150", 10000)
    truck.towingCapacity
    truck.accelerate()
    truck.brake()
    truck.tow()

}