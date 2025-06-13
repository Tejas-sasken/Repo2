fun Group(lists: List<String>): MutableMap<Int,MutableList<String>>{
    var grouped = mutableMapOf<Int, MutableList<String>>();

    for(list in lists){
        var len= list.length;
        if(len !in grouped){
            grouped[len] = mutableListOf();
        }
        grouped[len]?.add(list);
    }
    return grouped;
}

fun main(){
    var list = listOf("ant", "apple","Mango","forest","a");
    println(Group(list));
}