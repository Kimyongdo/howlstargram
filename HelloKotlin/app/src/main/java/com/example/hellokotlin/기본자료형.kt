package com.example.hellokotlin

fun main(){
    var a:Int =123 //변수:자료형=초기화값
    var b:Int? = null//?을 붙이면 null사용가능-nullpointException 가능.
    var c:Long = 1234L//L을 붙여 더 큰 메모리를 사용한다는 것을 표시
    var d:Int = 0x1af //16진수
    var e:Int = 0b10110110//2진수  코틀린은 8진수 지원안함
    var f:Double = 123.5 //소
    var g:Float = 123.5f//double이 기본이기에 f를 붙여준다.
    var h:Char = '가'
    var i:Boolean =true
    var j ="문자열은 따옴표"
    var k = """ 따옴표 세개 
        |자동으로 띄어쓰기
        |가능함.
    """.trimMargin()

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(g)
    println(i)
    println(j)
    println(k)



}

//세미콜론 없음
//클래스 이름은 파스칼표기법 ClassName(대문자로 단어시작)
//함수,변수 이름은 카멜표기법 functionName(소문자로 시작)
//var -  언제든지 읽기 쓰기 가능
//val - 처음 선언시 이후 중간값 변경 불가능
//클래스에 선언된 변수를 Property(속성)
//Scope내에 선언된 변수 - Local Variable 로컬변수
//초기화 하지 않으면 null값으로 주지 않음.
//Byte 8bits Short 16bits Int 32bits   Long 64bits
//Float 32bits Double 64bits
//코틀린 - UTF-16BE이므로 2Byes(16bits)의 메모리 공간을 사용

