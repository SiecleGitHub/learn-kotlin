fun main(args : Array<String>) {

    // Ex01
    var unitLambda: () -> Unit = { println("Ex01: " + "Kotlin is awesome") }
    unitLambda()

    // Ex02
    var counter = 0
    val incrementCounter = {
        counter += 1
        counter
    }
    println("Ex02: " + incrementCounter())
    println("Ex02: " + incrementCounter())

    // Ex03
    // same as above
    var counterAgain = 0
    val incrementCounterAgain: () -> Int = {
        counterAgain += 1
        counterAgain
    }
    println("Ex03: " + incrementCounterAgain())
    println("Ex03: " + incrementCounterAgain())

    // Ex04
    fun countingLambda() : () -> Int {
        var counterMore = 0
        val incrementCounterMore: () -> Int = {
            counterMore += 1
            counterMore
        }
        return incrementCounterMore
    }
    val counter1 = countingLambda()
    val counter2 = countingLambda()
    println("Ex04: " + counter1())
    println("Ex04: " + counter2())
    println("Ex04: " + counter1())
    println("Ex04: " + counter1())
    println("Ex04: " + counter2())
}