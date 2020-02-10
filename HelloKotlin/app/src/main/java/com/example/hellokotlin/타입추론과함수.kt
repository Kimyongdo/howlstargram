package com.example.hellokotlin

fun main(){

    var a =1234 //Int
    var b =1234L//Long
    var c =12.45//Double
    var d= 12.45f//Float
    var e = 0xABCD//Int
    var f = 0b010101//Int
    var g = true
    var h = 'c' //타입추론을 통해 코드량 감소

    println(add(1,2,3))
    println(add2(3,4,5))

}
//타입추론 - 자료형을 쓰지 않아도 자동으로 자료형을 추론해주는 기능
//var S:String 의 :String을 안써도
//var a:Array<Int> = arrayOf(1,2,3,4,5)에서 :Array<Int>을 안써도 자동추론
//선언시 값을 할당한다면 자료형 명시할 필요 없음.

fun add(a:Int, b:Int, c:Int):Int{ //:Int 반환하는 값을 자료형으로 쓴다.반환형이라고 한다.
     return a+b+c
} //함수 function의 줄인말로 시작
//return이 있으면 계산 중간이라도 값을 반환하고 그 함수 종료

fun add2(a:Int,b:Int,c:Int)=a+b+c //단일 표현식으로도 활용 가능, 반환형 생략가능

