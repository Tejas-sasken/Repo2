fun maxNumStones(n: Int,x: Int, stones: Array<Int>): Int{
    var mutableStones = stones.toMutableList();
    var MarsStones = mutableListOf<Int>();
    for(i in 1..n){
        MarsStones.add(i);
    }
    for(i in stones){
        if(MarsStones.contains(i))
            MarsStones.remove(i);
    }
    MarsStones.sort();

    var totalWeight = 0;
    var weight =0;
    var count =0;

    for(weight in MarsStones){
        if(weight+totalWeight<=n){
            totalWeight+=weight;
            count++;
        }
    }
    return count;
}

fun main(){
    var n=10;
    var x =3;
    var arr = arrayOf(3,2,5);
    println(maxNumStones(n,x,arr));
}