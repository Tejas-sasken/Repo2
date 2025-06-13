fun isPalindrome(s: String): Boolean {
    if(s.length < 2) return false;
    return s == s.reversed();
}

fun isHalindrome(s:String): Boolean {
    if(isPalindrome(s)) return true;
    if(s.length <= 2) return false;
    var mid = s.length/2;
    var s1: String;
    var s2: String;

    if(s.length%2 == 0) {
        s1 = s.substring(0,mid);
        s2 = s.substring(mid);
        println(s);
        println(s1);
        println(s2);
    }
    else{
        s1 = s.substring(0,mid);
        s2 = s.substring(mid+1);
        println(s);
        println(s1);
        println(s2);
    }

    return isHalindrome(s1)||isHalindrome(s2);
}

fun countHalendromes(Strings: Array<String>): Int {
    var count =0;
    for(s in Strings){
        if(isHalindrome(s)){
            count++;
        }
    }
    return count;
}

fun main(){
    println("Enter the no of Strings: ");
    val input1 = readLine()!!.toInt();
    val input2 = Array(input1){""}
    for(i in 0 until input1){
        input2[i] = readLine()!!.trim();
    }
    val result = countHalendromes(input2);
    println(result);
}