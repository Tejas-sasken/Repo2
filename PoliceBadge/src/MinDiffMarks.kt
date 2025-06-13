fun selectStudents(n: Int, marks: IntArray, k: Int): IntArray {
    if (k == 1) {
        return intArrayOf(marks.maxOrNull() ?: -1)
    }

    val sortedMarks = marks.sorted()
    var minDiff = Int.MAX_VALUE
    var startIndex = 0

    for (i in 0..(n - k)) {
        val diff = sortedMarks[i + k - 1] - sortedMarks[i]
        if (diff < minDiff) {
            minDiff = diff
            startIndex = i
        }
    }

    return sortedMarks.subList(startIndex, startIndex + k).toIntArray()
}

fun main() {
    // Example 1
    val input1 = 10
    val input2 = intArrayOf(950, 477, 55, 602, 881, 302, 859, 438, 551, 382)
    val input3 = 1
    println(selectStudents(input1, input2, input3).joinToString(", "))

    // Example 2
    val input4 = 7
    val input5 = intArrayOf(12, 99, 22, 21,23,24, 6)
    val input6 = 4
    println(selectStudents(input4, input5, input6).joinToString(", "))
}
