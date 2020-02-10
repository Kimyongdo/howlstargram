package com.example.kotlin.section3.LocalReturn



fun main(){
    shortFunc(3){
        println("First Call $it")
        return // after호출 불가능
    }

}

//noinline은 복사되지 않음.
inline fun shortFunc(a:Int,  out:(Int)->Unit){
    println("Before calling out()")
    out(a)
    println("After calling out()")
}