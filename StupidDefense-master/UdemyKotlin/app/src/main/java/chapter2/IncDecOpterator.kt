package chapter2

fun main(){
    var num=10
    var num2 =10
    val result = ++num
    val result2 = num2++

    println(result)//11
    println(result2)//10
    println(num)//11
    println(num2)//11
}