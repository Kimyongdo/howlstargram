package com.example.hellokotlin

fun main(){
    var a = Person4("박보영",1990) //new 키워드를 쓰지 않고 소환.
    var b = Person4("전정국",1997) //Person("전정국",1997) 이게 인스턴스
    var c = Person4("장원영",2004)
    println("안녕하세요 제 이름은 ${a.name}이고 ${a.birthYear}년생입니다") //a.name이 인스턴스의 속성
    //중괄호를 사용하여 오해가 없게끔 한다.
    a.introduce()
    b.introduce()
    c.introduce()

}

//클래스 = 고유의 특징값인 속성과 기능의 구현인 함수로 이루어짐

class Person4(var name:String, val birthYear:Int){ //멤버변수를 여기에 넣는다
    fun introduce(){
        println("함수형  : 안녕하세요 ${birthYear}년생 ${name}입니다.")
    }
}

//인스턴스 : 클래스를 이용해서 만들어내는 서로 다른 속성의 객체를 지칭하는 용어

//reactive-native, fluter 하이브리드 앱
