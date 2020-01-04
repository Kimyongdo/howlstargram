package chapter2

fun main(){

    val number1 =12 //1100
    val number2 =25
    val result:Int

    result = number1 or number2 // result=number1.or(number2)와 동일함
    //디버그 모드 - 2진수로 변경하여 본다.
    println(result)
}