
class Address (val street: String, val number: String, val postCode: String, val city: String)
data class AddressData (val street: String, val number: String, val postCode: String, val city: String)

fun main(args: Array<String>) {
    val residence1 = Address("Main street", "42", "1234", "New York")
    val residence2 = Address("Main street", "42", "1234", "New York")
    // println(): Address@d716361
    println(residence1)
    // referential equality: false
    println(residence1 === residence2)
    // structural equality: false
    println(residence1 == residence2)
    // copy -> not available in simple classes -> compiler error
    //val neighbour1 = residence1.copy( number = "43")
    //println(neighbour1)
    // destructuring: -> not available -> compiler error
    //residence1.component1()
    //val (street, number, postCode, city) = residence1
    // println(): not possible
    //println("$street, $number, $postCode, $city")

    // generates: hashCode(), equals(), toString(), copy(), destructuring operator
    val residence3 = AddressData("Main street", "42", "1234", "New York")
    val residence4 = AddressData("Main street", "42", "1234", "New York")
    // println(): AddressData(street=Main street, number=42, postCode=1234, city=New York)
    println(residence3)
    // referential equality: false
    println(residence3 === residence4)
    // structural equality: true
    println(residence3 == residence4)
    // copy -> deep copy
    val neighbour3 = residence3.copy( number = "43")
    // println(): AddressData(street=Main street, number=43, postCode=1234, city=New York)
    println(neighbour3)
    // destructuring: -> possible
    println(residence3.component1())  // Main Street
    val (street, number, postCode, city) = residence3
    // println(): Main street, 42, 1234, New York
    println("$street, $number, $postCode, $city")
}