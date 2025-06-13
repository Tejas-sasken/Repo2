fun main() {
    val data = arrayOf(
        intArrayOf(1, 7),
        intArrayOf(2, 4),
        intArrayOf(6, 9),
        intArrayOf(3, 8),
        intArrayOf(5, 10)
    )

    val list = data.toMutableList()

    // Sort by the second element of the pair
    list.sortBy { it[1] }

    if (list.isNotEmpty()) {
        print(list[0][1]) // Print the smallest second value after sorting
    }
}
