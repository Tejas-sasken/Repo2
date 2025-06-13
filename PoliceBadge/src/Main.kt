fun minExtraStars(badges: IntArray): Int {
    badges.sort();
    var extraStars =0;

    for(i in 1 until badges.size){
        if(badges[i-1] == badges[i]){
            val required = badges[i-1]+1;
            extraStars += required -badges[i];
            badges[i] = required;
        }
    }

    return extraStars;
}

fun main() {
    val badges = intArrayOf(1,2,2,4);
    println(minExtraStars(badges));
}