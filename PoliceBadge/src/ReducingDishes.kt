fun like(satisfied: IntArray):Int
{
    var sum =0;
    var total = 0;

    satisfied.sortDescending();

    for(sat in satisfied)
    {
        sum += sat;
        if(sum < 0) break;

        total += sum;
    }

    return total;
}
fun main() {
    var arr = intArrayOf(-1,-4,-5,3);
    println(like(arr));
}