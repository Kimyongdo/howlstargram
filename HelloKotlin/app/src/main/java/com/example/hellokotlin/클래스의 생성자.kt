package com.example.hellokotlin

fun main(){
    //기본생성자 ->파라미터 -> init
    var a = Person2("박보영",1990) //new 키워드를 쓰지 않고 소환.
    var b = Person2("전정국",1997) //Person("전정국",1997) 이게 인스턴스
    var c = Person2("장원영",2004)

    //보조생성자 -> 파라미터 -> init
    var d = Person2("이루다")
    var e = Person2("차은우")
    var f = Person2("류수정")

}

//생성자 : 새로운 인스턴스를 만들기 위해 호출하는 특수한 함수
//생성자 : 인스턴스의 속성 초기화 지정, 인스턴스 생성시 구문을 수행
//init함수 : 패러미터나 반환형이 없는 특수한 함수
//생성자를 통해 인스턴스가 만들어질 때  호출되는 함수

class Person2(var name:String, val brithday:Int){
    init {
       println("${this.brithday}년생 ${this.name}님이 생성되었습니다.")
    }

    constructor(name:String):this(name,1997){
        println("보조 생성자가 사용되었습니다.")
    } //보조생성자 만들 때 기본생성자를 통해 속성 초기화 필수
}
//var a = Person2("박보영",1990)를 사용한 것만으로도 init이 호출됨.
//보조생성자 : 기본생성자와 다른 생성자를 제공하여 인스턴스 생성시 편의를 제공
 //추가적인 기능을 제공하는 기능을 수행
