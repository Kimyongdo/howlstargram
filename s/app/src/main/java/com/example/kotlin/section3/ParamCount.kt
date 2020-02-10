package com.example.kotlin.section3

fun main(){
    //매개변수 없는 람다식 함수
    noParam({"Hello World"})
    noParam{"Hello World"}


    oneParam { a->"Hello World! $a" }
    oneParam { "Hello World $it" }

}

fun noParam(out:()->String) = println(out())

fun oneParam(out:(String)->String){
    println(out("OneParam"))
}