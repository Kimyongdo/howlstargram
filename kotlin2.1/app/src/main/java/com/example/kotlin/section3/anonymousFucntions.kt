package com.example.kotlin.section3.anonymousFunctions

fun main(){
    //변수로 람다식으로 만들고 이를 익명함수로 받음.
    val add:(Int, Int)->Int = fun(a,b)=a+b//익명함수
    val add2={x:Int, y:Int -> x+y}
    var result = add(10,2)
    var result2 = add2(10,20)
    println(result)
    println(result2)
}