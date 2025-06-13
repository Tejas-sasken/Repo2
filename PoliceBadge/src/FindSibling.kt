fun findSibling(n: Int,tree: IntArray,x: Int): IntArray {
    val index = tree.indexOf(x);
    println("index of x: "+index)

    if(index == -1 || index == 0) {
        println("return with index : $index")
        return intArrayOf(-1);

    }

    val parentIndex = (index -1)/2;
    println("parentIndex: $parentIndex");
    var sibling = 0;

    val left = 2 * parentIndex + 1;
    if(left < n && tree[left] != x){
        sibling = tree[left];
        println("LeftIndex: $left");
        println("LeftIndex: "+ tree[left]);
    }

    val right = 2*parentIndex+2;
    if(right<n && tree[right]!=x){
        sibling = tree[right];
        println("LeftIndex: $right");
        println("LeftIndex: "+ tree[right]);

    }

    println("Sibling: $sibling");

    return if(sibling==0) intArrayOf(-1) else intArrayOf(sibling);
}

fun main(){
    val input1 =9;
    val input2 = intArrayOf(1,2,3,4,5,6,7,8,9);
    val input3 = 5;
    val result = findSibling(input1,input2,input3);

    println("Sibling of $input3: ${result.joinToString (", " )}");
}