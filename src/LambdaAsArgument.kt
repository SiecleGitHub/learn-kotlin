fun main(args : Array<String>) {

    fun operateOnNumbers(a: Int, b: Int, operation: (Int, Int) -> Int) : Int {
        val result = operation(a, b)
        println(result)
        return result
    }
    val addLambda = { a: Int, b: Int -> Int
        a + b
    }
    val subtractLambda = { a: Int, b: Int -> Int
        a - b
    }
    val multiplyLambda = { a: Int, b: Int -> Int
        a * b
    }
    val divideLambda = { a: Int, b: Int -> Int
        a / b
    }

    val x = 4
    val y = 2
    operateOnNumbers(x, y, operation = addLambda)
    operateOnNumbers(x, y, operation = subtractLambda)
    operateOnNumbers(x, y, operation = multiplyLambda)
    operateOnNumbers(x, y, operation = divideLambda)
    operateOnNumbers(x, y, operation = Int::times)
    operateOnNumbers(x, y, operation = Int::div)
}






