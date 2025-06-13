fun main(){
    var arr = arrayOf(1.3,2.3,4.5,3.4)
    for(i in 0 until arr.size){
        println(arr[i]);
    }

    var arr1 = Array<Int>(6){ 0};
    for(i in arr1){
        println(i);
    }
}