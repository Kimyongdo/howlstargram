package com.example.hellokotlin

fun main(){
    val test1 = "Test.Kotlin.String"
    println(test1.length)
    println(test1.toLowerCase())
    println(test1.toUpperCase())

    val test2 = test1.split(".")
    println(test2)

    println(test2.joinToString()) //
    println(test2.joinToString("-"))

    println(test1.substring(5..10)) //일부만 쓰는 기능

    val nullString:String?=null
    val emptyString=""
    val blankString=" "
    val normalString= "A"
    //null이거나 empty이면 true를 반환
    println(nullString.isNullOrEmpty())
    println(emptyString.isNullOrEmpty())
    println(blankString.isNullOrEmpty())
    println(normalString.isNullOrEmpty())

    //null이거나 blank이면 true를 반환
    println()
    println(nullString.isNullOrBlank())
    println(emptyString.isNullOrBlank())
    println(blankString.isNullOrBlank())
    println(normalString.isNullOrBlank())

    var test3 = "kotlin.kt"
    var test4 = "java.java"
    println()
    //처음시작이 java로 시작하냐?
    println(test3.startsWith("java")) //false
    println(test4.startsWith("java")) //true
    println()
    //끝 부분이 /kt로 끝나냐?
    println(test3.endsWith(".kt"))
    println(test4.endsWith(".kt"))
    println()
    //lin이 포함되어있는가
    println(test3.contains("lin"))
    println(test4.contains("lin"))

}