fun ReverseNo(num: Int):Int {
    var res=0;
    var no=num;
    while(no>0){
        res= res*10+no%10;
        no = no/10;
    }
    return res;
}

fun main(){
    println(ReverseNo(1234));
}