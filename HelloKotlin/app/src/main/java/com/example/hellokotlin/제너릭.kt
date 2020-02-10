package com.example.hellokotlin

fun main(){
var a = A()
    a.shout()
var b = B()
    b.shout()
    println()
UsingGeneric(A()).doshouting()
// UsingGeneric<A>(A()).doshouting() <A>를 써도 무방하지만 A()를 넣기에 생략가능하다
    UsingGeneric(B()).doshouting()
    UsingGeneric(C()).doshouting()

    println()
    doShouting(B())
}

fun<T:A>doShouting(t:T){ //<T:A>을 따로 선언한것 //B()을 넣으면 T가 타입추론을 해줘 자료형전달이 필요 없음
    t.shout()
}

open class A{
    open fun shout(){
        println("A가 소리칩니다")
    }
}

class B:A(){
    override fun shout() {
        println("B가 소리칩니다")
    }
}

class C:A(){
    override fun shout() {
        println("C가 소리칩니다")
    }
}

//제너릭을 사용하면 Generic이 자료형을 대체하게 되어 캐스팅을 방지할 수 있어 성능을 높일 수 있다
class UsingGeneric<T:A>(val t:T){ //T는 모든지 가능하지만 A를 상속받아 A로 제한, // 생성자에서는 제너릭 T에 맞는 인스턴스 속성 t로 받아보자

    fun doshouting(){
        t.shout()
    }

}
//제너릭 : 클래스나 함수에서 사용하는 자료형을 외부에서 저장할 수 있는 기능

// class A와 A를 상속받은 클래스 B가 있다고 가정
// fun castingExam(var a:A) B를 넣어도 A로 캐스팅됨
//캐스팅연신을 거치면 프로그램 속도 저하
// fun<T>genericFunc(var:param:T){} 타입추론 T를 쓰는 경우
// genericFunc(1)을 넣어 1이 int임을 추론하여 T가 int로 자동변경됨.

