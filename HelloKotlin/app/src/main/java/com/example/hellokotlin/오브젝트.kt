package com.example.hellokotlin

fun main(){
    println(Counter.count) //생성자를 소환하지 않는다.
    Counter.countup()
    Counter.countup()
    println(Counter.count)
    Counter.clear()
    println(Counter.count)

    var a  = FoodPoll("짜장")
    var b = FoodPoll("짬뽕")

    a.vote()
    a.vote()
    b.vote()
    b.vote()
    b.vote()
    println("이름 : ${a.name}, 투표수 : ${a.count}")
    println("이름 : ${b.name}, 투표수 : ${b.count}")
    println("총 투표수 : ${FoodPoll.total}")
    //서로 다른 instance임에도 conpaminObject내에 있는 total을 공유
    //누적투표가능 static같은 느낌.

}

class FoodPoll(val name:String){
    companion object{
        var total =0
    }
    var count =0 //companion obejct의 바깥 - 일반적인 속성으로 만들기
    fun vote(){
        total++
        count++
    }

}
object Counter{ //obejct는 인스턴스를 생성하지 않고 그 자체로 객체이기에 생성자는 사용하지 않는다.
    var count =0
    fun countup(){count++}
    fun clear(){count=0}
}//object로 선언된 객체는 최초 사용시 자동생성, 코드 전체에서 공용으로 사용

//Singleton Pattern : 클래스의 인스턴스를 단 하나만 만들어 사용하도록 하는 코딩 아키텍쳐 패턴

