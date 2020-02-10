package com.example.hellokotlin

fun main(){
    val a = General("보영",212)
    println(a== General("보영",212))
    println(a.hashCode())
    println(a)

    println()
    val b = Data("루다",306)
    println(b==Data("루다",306))
    println(b.hashCode())
    println(b)
    println(b.copy())
    println(b.copy("아린"))
    println(b.copy(id=618)) //named argument을 통해 id만 변경
    //DataClass를 사용하면 의미 있는 값을 생성함

    val list = listOf(
        Data("보영",212),
        Data("루다",306),
        Data("아린",618))

    for((a,b) in list){ //for문에서 두개의 객체를 받으려면 (a,b)식으로 쓴다
        println("${a},${b}")
    //내부적으로 component1(), component2()라는 함수를 사용하여 순차적으로 받아옴
    }

    var state = State.SING
    println(state) //상태객체의 이름 출력
    state = State.SLEEP
    println(state.isSleeping()) //비교값 출력
    state = State.EAT
    println(state.message) //message속성

}
// data class는 데이터를 다루는데에 최적한 class로
//5가지의 기능을 내부적으로 자동생성
// 1. equals()의 자동구현 : 내용의 동일성을 판단
// 2. hashcode()의 자동구현 : 객체의 내용에서 고유한 코드를 생성
// 3. toString()의 자동구현 : 포함된 속성을 보기쉽게 나타냄
// 4. copy()의 자동구현 : 객체를 복사하여 똑같은 내용의 새 객체를 만듦
// 5. componentX()의 자동구현 : 속성을 순서대로 반환

class General(val name:String, val id:Int)
data class Data(val name:String, val id:Int)

enum class State (val message:String){
    SING("노래를 부릅니다"),
    EAT("밥을 먹습니다"),
    SLEEP("잠을 잡니다"); //관례적으로 대문자로 표시

    fun isSleeping() = this == State.SLEEP // fun isSleeping() = ((this == State.SLEEP)) 느낌.
    //비교할 대상이 자기 자신이므로 this로 한다
    //잠을 자는지에 대한 여부를 boolean값으로 반환


}



//Enum class
//enumerated type 열거형의 준말
