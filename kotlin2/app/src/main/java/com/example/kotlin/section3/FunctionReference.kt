package com.example.kotlin.section3

fun main(){
    //1. 인자봐 반환값이 있는 함수
    val res1 = funParama(3,2,::sum)
    println(res1)

    //2. 인자가 없는 함수
    hello(::text)


    //3. 일반변수에 값처럼 할당
    val likelambda = ::sum
    println(likelambda)
}

fun sum(a:Int, b:Int)=a+b

fun text(a:String, b:String)="HI! $a, $b"

fun funParama(a:Int, b:Int, c:(Int, Int)->Int):Int{
    return c(a,b)
}

fun hello(body:(String,String)->String):Unit{
    println(body("Hello","world"))
}