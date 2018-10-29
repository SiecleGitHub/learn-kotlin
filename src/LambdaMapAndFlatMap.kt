fun main(args : Array<String>) {
    // map
    val list = (0..20).toList()
    val doubled = list.map{ item -> item * 2 }
    // list items times 2, returned items in list remain of type Int
    println(doubled)
    // [0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40]
    // same just with implicit it variable
    println(list.map{ it * 2 })
    // [0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40]

    val average = list.average()
    // returned list changes type from Int to Double
    val shifted = list.map{ it - average }
    println(shifted)
    // [-10.0, -9.0, -8.0, -7.0, -6.0, -5.0, -4.0, -3.0, -2.0, -1.0, 0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0]

    // flatMap val nestedList :List<List<Int>> = listOf(...
    val nestedList = listOf(
            (0..10).toList(),
            (11..20).toList(),
            (21..30).toList()
    )
    println(nestedList)
    // [[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10], [11, 12, 13, 14, 15, 16, 17, 18, 19, 20], [21, 22, 23, 24, 25, 26, 27, 28, 29, 30]]

    // val notFlattened :List<List<Int>> = nestedList.map { it.sortedDescending() }
    val notFlattened = nestedList.map { it.sortedDescending() }
    println(notFlattened)
    // [[10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0], [20, 19, 18, 17, 16, 15, 14, 13, 12, 11], [30, 29, 28, 27, 26, 25, 24, 23, 22, 21]]

    // val flattenedIn2Steps :List<List<Int>> = nestedList.map { it.sortedDescending() }.flatten()
    val flattenedIn2Steps = nestedList.map { it.sortedDescending() }.flatten()
    println(flattenedIn2Steps)
    // [10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21]

    // val flattenedIn1Step :List<Int> = nestedList.flatMap { it.sortedDescending() }
    // return type changes - is now "flattened"
    val flattenedIn1Step = nestedList.flatMap { it.sortedDescending() }
    println(flattenedIn1Step)
    // [10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21]
}