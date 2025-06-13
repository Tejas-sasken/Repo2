fun main() {
    val data = arrayOf(
        intArrayOf(1, 3),
        intArrayOf(4, 6),
        intArrayOf(5, 7),
        intArrayOf(4, 7),
        intArrayOf(6, 7)
    )

    // Print the original data
    println("Original data:")
    for (pair in data) {
        println("(${pair[0]}, ${pair[1]})")
    }

    val list = data.toMutableList()

    // Sort by the second element of the pair
    list.sortBy { it[1] }

    // Print the sorted list
    println("\nSorted by second value:")
    for (pair in list) {
        println("(${pair[0]}, ${pair[1]})")
    }

    // Print the smallest second value
    if (list.isNotEmpty()) {
        println("\nSmallest second value: ${list[0][1]}")
    }
}
