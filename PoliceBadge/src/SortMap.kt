fun main() {
    var map = mutableMapOf("banana" to 3,"apple" to 2,"cat" to 1);

    var sortByKey = map.toList().sortedBy{it.first}.toMap().toMutableMap();
    println(sortByKey);

    var sortedByDescKey = sortByKey.toList().sortedByDescending { it.first }.toMap().toMutableMap();
    println(sortedByDescKey);

    var sortedByValue = map.toList().sortedBy { it.second }.toMap().toMutableMap();
    println(sortedByValue);

    var sortedByDescValue = map.toList().sortedByDescending { it.second }.toMap().toMutableMap();
    println(sortedByDescValue)
}