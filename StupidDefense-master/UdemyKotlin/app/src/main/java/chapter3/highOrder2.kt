package com.example.kotlin.section3.highorder2

fun main(){

    //{x:Int , y:Int -> x+y}을 ::sum으로 변경
    //일반함수를 람다식처럼 사용하기 위해서 ::가 필요하다
    var result:Int = highorder(::sum,10,20)
    println(result)//30


    //람다식을 매개변수와 인자로 사용하는 함수

}

fun highorder(sum:(Int, Int)->Int, a:Int, b:Int):Int{
    return sum(a,b)
}

fun sum(a:Int, b:Int):Int = a+b