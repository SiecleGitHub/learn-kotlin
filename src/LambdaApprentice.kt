
fun main(args : Array<String>) {
    // declaration
    var multiplyLambda: (Int, Int) -> Int
    var addLambda: (Int, Int) -> Int

    multiplyLambda = { a: Int, b: Int -> Int
        a * b }
    val lambdaResult = multiplyLambda(2,3)
    println("Ex01: $lambdaResult")

    addLambda = { a, b -> a + b }
    println("Ex02: " + addLambda(2,3))

    var doubleLambda = { a: Int ->
        2 * a
    }
    println(doubleLambda(2))

    doubleLambda = { 3 * it }
    println(doubleLambda(2))

    val square: (Int) -> Int = { it * it }
    println(square(6))
}

