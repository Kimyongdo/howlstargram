package com.example.kotlin

fun main(){

    val result:Int
    //일반변수에 람다식 할당

    val multi={x:Int, y:Int -> x*y}
    //람다식이 할당된 변수는 함수처럼 사용 가능
    result = multi(10,20)
    println(result)
}