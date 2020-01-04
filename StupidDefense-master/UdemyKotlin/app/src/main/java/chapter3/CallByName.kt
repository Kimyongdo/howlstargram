package com.example.kotlin.section3.CallbyName

fun main(){
    val result = callByName(otherLambda)
    println(result)
}

fun callByName(b:() -> Boolean):Boolean{
    println("이름으로 람다 호출하기.")
    return b()
}

val otherLambda:()->Boolean={
    println("이름으로 호출하기. ")
    true
}

