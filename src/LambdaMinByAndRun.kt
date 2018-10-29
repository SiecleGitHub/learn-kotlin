fun main(args: Array<String>) {

//    I'm in a lambda!
//    Employee(firstName=Mike, lastName=Jones, startYear=2002)
//    25
//    I'm in a function!
//    John
//    Jane
//    Mary
//    Mike

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

    useParameter(employees)
}

fun topLevelFunction() = println("I'm in a function!")

fun useParameter(employees: List<Employee>) {
    employees.forEach {
        println(it.firstName)
    }
}

data class Employee(val firstName: String, val lastName: String, val startYear: Int)
