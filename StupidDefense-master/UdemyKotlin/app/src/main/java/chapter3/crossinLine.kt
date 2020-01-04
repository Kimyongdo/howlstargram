package com.example.kotlin.section3.crossinLine

fun main(){
    //인라인 함수 shortFunc의 내용이 복사되어 들어감.
    shortFunc(3){
        println("First call $it")
        //return 사용불가.
    }

}

//noinline은 복사되지 않음.
inline fun shortFunc(a:Int, crossinline out:(Int)->Unit){
    println("Before calling out()")
    nestedFunc{out(a)}
    println("After calling out()")
}

fun nestedFunc(body:()->Unit){
    body()//First call 3

}