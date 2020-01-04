package chapter3.section5

fun main(){
    val number =4
    val result:Long
    result= factorial(number)
    println(result)
}

fun factorial(n:Int):Long{
    return if(n==1) n.toLong() else n* factorial(n-1)
}