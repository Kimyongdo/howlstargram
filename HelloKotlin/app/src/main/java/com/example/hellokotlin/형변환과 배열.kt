package com.example.hellokotlin

fun main(){
var a:Int =54321
var b:Long =a.toLong() //toLong으로 형변환 필수
    println(b)
var intArr = arrayOf(1,2,3,4,5) //직접 집어넣음
var nullArr = arrayOfNulls<Int>(5) //int 비어있는 공간 5개
//<Int> <>을 제너릭이라고 한다.
    intArr[4]=6//값을 변경하거나
    println(intArr[2])//호출가능

}

//형변환
//toByte()
//toShort()
//toInt()
//toLong()
//toFloat()
//toDouble()
//toChar()

//코틀린에서는 묵시적형변환 없음, 명시적형변환만 가능 (오류막기위해)

