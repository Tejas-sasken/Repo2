fun isVowel(ch: Char): Boolean{
    return ch.toLowerCase() in listOf('a','e','i','o','u');
}

fun lcsWihVowels(s1: String, s2: String): Int {
    val m = s1.length;
    val n = s2.length;

    var dp = Array(m+1){IntArray(n+1)};

    for(i in 1..m){
        for(j in 1..n){
            if(isVowel(s1[i-1]) && s1[i-1] == s2[j-1]){
                dp[i][j] = dp[i-1][j-1] + 1;
            }
            else{
                dp[i][j] = maxOf(dp[i-1][j],dp[i][j-1]);
            }
        }
    }
    return dp[m][n];
}


fun main(){
println(lcsWihVowels("appleaaae","appleaes"));
}
