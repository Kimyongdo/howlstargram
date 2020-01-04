package chapter10.arraylist

fun main(){
     var numbers:List<Int> = listOf(1,2,3,4,5)
    var names = listOf("one","two","three")
    var mixed = listOf("one",1,1.5,'c')

    println("numbers $numbers")
    println("names $names")
    println("mixed $mixed")

    println("numbers ${numbers.size}")
    println("numbers ${numbers.indexOf(3)}")
    println("numbers ${numbers.get(0)}")
    println("numbers ${numbers.contains(1)}")

}