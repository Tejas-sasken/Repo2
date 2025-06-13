fun main(){
    val str: String = "Kotlin is fun !".reversed()
    var arr = str.split(" ").reversed().joinToString(" ");
    println(arr)

    var str1 = "malylam";
    if(str1.uppercase() == str1.reversed().uppercase()){
        println("Palendrome")
    }






}