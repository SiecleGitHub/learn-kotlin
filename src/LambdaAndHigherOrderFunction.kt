
fun main(args : Array<String>) {

    val list = (0..40).toList()
    println(list.filter{ item -> item % 2 == 0 })
    // [0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40]

    // use implicit it variable
    println(list.filter{ it % 2 == 0 })
    // [0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40]

    // use extension function
    println(list.filter{ it.even() })
    // [0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40]

    // use function pointer
    println(list.filter(::isEven))
    // [0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40]
}

fun Int.even() = this % 2 == 0

fun isEven(i: Int) = i % 2 == 0