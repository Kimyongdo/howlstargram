package com.example.hellokotlin

fun main(){
     var a = Animal("별이",5,"개")
    var b = Dog("별이",5)
    a.introduce()
    b.introduce()
    b.bark()
    var c = Cat("네롱이",3)
    c.bark()
    c.introduce() //상속을 받았기에 두개 다 사용 가능 .
}

open class Animal(var name:String, var age:Int, var type:String){
    fun introduce(){
        println("저는 ${type} ${name}이고 ${age}살 입니다.")
    }
}


//상속을 주는 클래스 -> 수퍼클래스
//상속을 받는 클래스 -> 서브클래스
//open은 클래스가 상속될 수 있도록 클래스 선언시 붙여주는 키워드
//상속 규칙 첫번째 : 수퍼 클래스에 존재하는 속성과 같은 이름의 속성을 가질 수 없음
//서브클래스가 소환될 때 반드시 수퍼클래스의 생성자까지 호출되어야함
//

//:Animal을 통해 dog클래스는 Animal의 모든 기능을 사용 가능
class Dog(name:String, age: Int):Animal(name,age,"개"){
    fun bark(){
        println("멍멍") //dog클래스에서만 사용가능한 함수, Animal에서는 이 함수가 없다.
    }
} //"개"는 공통된 값이므로 고정값으로 설정, 상속받는거기 떄문에 var을 안쓴다.

class Cat(name:String, age:Int):Animal(name,age,"고양이"){
    fun bark(){
        println("야옹")
    }
}