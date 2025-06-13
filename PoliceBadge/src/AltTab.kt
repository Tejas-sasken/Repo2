fun altTabWindow(n:Int,k:Int,apps: MutableList<Int>): List<Int> {
    val index = k % n;
    val selectedApp = apps[index];
    apps.removeAt(index);
    apps.add(0,selectedApp);
    return apps;
}

fun main(){
    println("Enter the number of Applications: ");
    val n = readLine()!!.toInt();
    println("Enter number of times ALT+Tab Entered: ");
    val k= readLine()!!.toInt();

    val apps = MutableList(n) {it+1};
    val result = altTabWindow(n, k, apps)
    println("Final ALT-TAB order: ${result.joinToString(", ")}")


}