fun main(args: Array<String>) {
    run { println("I'm in a lambda!") }

    val employees = listOf(Employee("John", "Smith", 2012),
            Employee("Jane", "Wilson", 2015),
            Employee("Mary", "Johnson", 2010),
            Employee("Mike", "Jones", 2002))

    println(employees.minBy { it.startYear })

    var num = 10
    run {
        num += 15
        println(num)
    }

    run(::topLevelFunction)

    println(useParameter(employees))
}

fun topLevelFunction() = println("I'm in a function!")

fun useParameter(employees: List<Employee>) {
    employees.forEach {
        println(it.firstName)
    }
}

data class Employee(val firstName: String, val lastName: String, val startYear: Int)
