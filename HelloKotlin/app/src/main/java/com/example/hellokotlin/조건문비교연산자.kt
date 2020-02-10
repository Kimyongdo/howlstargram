package com.example.hellokotlin

fun main(){
     var a=7
    if(a>10) {
        println("a가 10보다 크다.")
    }else{
        println("a는 10보다 작다")
    }
    doWhen(1)
    doWhen("DiMO")
    doWhen(12L)
    doWhen(3.14)
    doWhen("Kotlin")

    println()

    doWhen2(1)
    doWhen2("DiMO")
    doWhen2(12L)
    doWhen2(3.14)
    doWhen2("Kotlin")

}
//비교연산자
//< <= > >= = !=
//같다 ==
// = 는 할당연산자
// 자료형이 맞는지 체크하는 is연산자
// 자료형이 틀린지 체크하는 !is연산자
//switch 문을 when으로 넘어옴.

fun doWhen (a:Any){ //어떤 자료형도 포함할 수 있는 코틀린 최상위 자료형 : Any
    when(a){
        1->println("정수 1입니다")
        "DiMO" ->println("코틀린강좌 공부중")
        is Long ->println("Long타입입니다.")
        !is String ->println("Long타입이 아닙니다.")
        else->println("어떤 조건에도 맞지 않습니다") //else 어떤 조건에도 맞지 않음
    }
}
//when : 여러개가 일치해도 먼저 부합하는 조건이 실행
//등호, 부등호 사용이 불가능 when을 쓰면 한번에 하나만.

fun doWhen2 (a:Any){ //어떤 자료형도 포함할 수 있는 코틀린 최상위 자료형 : Any
    var result = when(a){
        1->"정수 1입니다"
        "DiMO" ->"코틀린강좌 공부중"
        is Long ->"Long타입입니다."
        !is String ->"Long타입이 아닙니다."
        else->"어떤 조건에도 맞지 않습니다" //else 어떤 조건에도 맞지 않음
    }
    println(result) //when의 결과값을 변수로 받아서 출력가능

}