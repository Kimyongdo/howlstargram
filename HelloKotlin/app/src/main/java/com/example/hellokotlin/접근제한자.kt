//package com.example.hellokotlin
//
//fun main(){
//
//}

val a = "패키지 스코프 "

class B{
    val a = "클래스 스코프 "
    fun print(){
        println(a)
    }
}

fun main(){

      val a = "함수 스코프"
      println(a)
      B().print() //참조변수 없이 바로 사용가능
}



//스코프(=범위) : 변수 함수 그 공용범위를 제어하는 단위
//스코프 외부에서 스코프 내부로의 접근을 제어하는 접근제한자
//스코프 : 변수나 함수 클래스 같은 멤버들을 서로 공유할 수 있는 범위를 지정해둔 단위
//스코프 지정 범위 : 패키지 내부, 클래스 내부, 함수 내부
//하나의 스코프 : 패키지 안에 변수 함스 클래스가 있다면 하나의 스코프
//변수 함수 클래스 안에 다시 변수 함수가 있다면 이는 하위스코프

//스코프 외부에서는 스코프 내부의 멤버를 참조연산자로만 참조 가능
//fun main()에서 외부 class의 함수를 참조할 경우 a.eat()형식느로 씀 .(=참조연산자)
//동일 스코프에서는 멤버들을 '공유'할 수 있음

//하위 스코프에서는 상위스코프의 멤버를 재정의할 수 있음.
//스코프의 같은 레벨에서는 같은 이름의 멤버를 만들어서는 안됩니다.
//하지만 하위스코프에서는 같은 이름의 멤버를 만들어 사용가능
//상위 스코프를 참조하지 않고 각각 클래스의 스코프에 있는 값 참조


//접근제한자에는 public internal private protected으로
//스코프 외부에서 내부로 접근을 개발자가 제어

//패키지 스코프에서는
//public 어떤 패키지에서도 접근 가능
//internal 같은 모듈 내에서만 접근 가능
// private 같은 파일 내에서만 접근 가능
//protected 클래스 자신과 상속받은 클래스에서 접근 가능

//클래스 스코프에서는
//public private protected 사용 가능, internal은 사용 안함.


