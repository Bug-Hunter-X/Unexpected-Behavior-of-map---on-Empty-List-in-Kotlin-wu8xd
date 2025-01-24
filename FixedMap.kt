fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }
    println(result) // Output: [2, 4, 6, 8, 10]

    val emptyList = emptyList<Int>()
    val emptyResult = emptyList.map { it * 2 }
    println(emptyResult) // Output: []

    // Handling potential empty list scenarios
    val anotherList = listOf(1,2,3)
    val safeResult = anotherList.ifEmpty { listOf(0) }.map { it * 2 }
    println(safeResult)

    val yetAnotherList : List<Int> = emptyList()
    val safeResult2 = yetAnotherList.ifEmpty { listOf(0) }.map { it * 2 }
    println(safeResult2) // Output [0] 
} 