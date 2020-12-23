
fun getLonger(num1 : List<Int>, num2 : List<Int>) : List<List<Int>>{
    var a = mutableListOf<Int>().apply { addAll(num1) }
    var b = mutableListOf<Int>().apply { addAll(num2) }
    if(a.size < b.size){
        val x = a
        a = b
        b = x
    }
    return listOf<List<Int>>(a, b)
}
