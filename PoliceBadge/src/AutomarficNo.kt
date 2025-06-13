fun checkAutomarfic(num: Int): Boolean {
    var no = num;
    var sq = no * no;
    while (no > 0) {
        if (sq % 10 != no % 10) {
            return false;
        }
                sq = sq / 10;
                no = no / 10

        }

    return  true
}

fun main(){
    println(checkAutomarfic(3))
}