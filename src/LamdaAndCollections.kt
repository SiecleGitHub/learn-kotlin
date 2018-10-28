fun main(args : Array<String>) {

    // Ex01
    val names = arrayOf("ZZZZZZ", "BB", "A", "CCCC", "EEEEE")
    println("Ex01: " + names.sorted())


    // Ex02
    val namesByLength = names.sortedWith(compareBy{
        -it.length
    })
    println("Ex02: $namesByLength")
}
