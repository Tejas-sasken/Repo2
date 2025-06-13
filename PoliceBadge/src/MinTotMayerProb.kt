fun minSun(marks: IntArray): Int {
    var sortedMarks = marks.sorted().toMutableList();
    var total =sortedMarks[0];
    for(i in 1 until marks.size){
        if(sortedMarks[i]==sortedMarks[i-1]){
            sortedMarks[i]+=1;
            total+=sortedMarks[i]
        }
    }
    return total;
}

fun main(){
    val num = intArrayOf(1,1,2,3);
    println(minSun(num));
}