fun checkAnagram(str1: String,str2: String): Boolean {
    if(str1.length!=str2.length){
        return false;
    }
    for(i in 0 until str1.length){
        if(str1[i]!=str2[str2.length-i-1]){
            return false;
        }
    }

    return true;
}
fun main(){
    var str1= "Hellowdnadna";
    var str2 = "andandwolleH"
    println(checkAnagram(str1,str2));
}