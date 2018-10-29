package lambda.with.receivers

fun main(args: Array<String>) {

//    1, 2, 3, 4, 5, 6, 7, 8, 9, 10
//    Yes, there's an employee with the last name Wilson
//    Nope, there's no employee with the last name Wilson
//    Nope, there's no employee with the last name Smithson
//    another string
//    SOME STRING
//    some string

    println(countTo10())

    val employees = listOf(Employee("John", "Smith", 2012),
            Employee("Jane", "Wilson", 2015),
            Employee("Mary", "Johnson", 2010),
            Employee("Mike", "Jones", 2002))

    findByLastName(employees, "Wilson")
    findByLastName(employees, "Smithson")

    "Some String".apply somestring@ {
        "Another String".apply {
            println(toLowerCase())
            println(this@somestring.toUpperCase())
        }
        println(toLowerCase())
    }
}

fun findByLastName(employees: List<Employee>, lastName: String) {
    employees.forEach returnBlock@ {
        if (it.lastName == lastName) {
            println("Yes, there's an employee with the last name $lastName")
            return@returnBlock
        }
    }
    println("Nope, there's no employee with the last name $lastName")
}

fun countTo10() =
        with(StringBuilder()) {
            for (i in 1..9) {
                append(i)
                append(", ")
            }
            append(10)
            toString()
        }

//fun countTo10() =
//        StringBuilder().apply {
//            for (i in 1..9) {
//                append(i)
//                append(", ")
//            }
//            append(10)
//        }.toString()

//fun countTo10(): String {
//    val numbers = StringBuilder()
//    for (i in 1..9) {
//        numbers.append(i)
//        numbers.append(", ")
//    }
//    numbers.append(10)
//    return numbers.toString()
//}

data class Employee(val firstName: String, val lastName: String, val startYear: Int)