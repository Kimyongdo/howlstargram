package com.example.kotlin.section3

fun main(){
    //인라인 함수 shortFunc의 내용이 복사되어 들어감.
    shortFunc(3){ println("First call $it")}
    println()
    shortFunc(5){ println("Second call $it")}
}

//noinline은 복사되지 않음.
inline fun shortFunc(a:Int, noinline out:(Int)->Unit){
    println("Before calling out()")
    out(a)
    println("After calling out()")
}