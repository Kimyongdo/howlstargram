package com.example.hellokotlin

fun main(){

    var t = Tiger()
    t.eat()

    var R = Rabbit()
    R.eat()
    R.sniff()

    var h = Dog2()
    h.eat()
    h.run()
}

//기본적으로 수퍼클래스의 함수와 같은 이름의 함수를 서브클래스에서 사용은 불가능
//하지만 오버라이드를 통해 다시 구현이 가능함.


open class Animal2{ //상속시켜줄 경우 open을 사용,
    open fun eat(){ //이 함수를 오버라이드 시키고 싶다면 open을 붙이고 서브클래스로 이동
        println("음식을 먹습니다.")
    }
}

class Tiger:Animal2(){//상속시 괄호는 필요함.
    override fun eat(){ //오버라이드를 한다면 ovrride를 명시해야함.
    println("고기를 먹습니다.")
}
}

//추상화 : 선언부만 있고 기능이 구현되지 않은 추상함수와
//추상함수를 포함하 는 추상클래스로 구성

abstract class Animal3{
    abstract fun eat() //abstract를 붙이고 어떤 내용도 쓰지 않는다.
    fun sniff(){
        println("킁킁")
    }
}
//추상함수는 미완성함수이기에 단독으로 인스턴스를 만들 수 없다.
//추상함수를 만들면 꼭 서브클래스를 만들어 이를 상속시켜줘야함.

class Rabbit:Animal3(){
    override fun eat(){
        println("당근을 먹습니다.")
    }
}

//코틀린에서는 인터페이스애서 속성,추상함수,일반함수 모두 가질 수 있음
//추상함수는 생성자를 가질 수 있으나 인터페이스는 생성자를 가질 수 없다.
//인터페이스에서 구현부가 있는 함수 -> open함수로 간주
//구현부가 없는 함수 -> abstarct함수로 간주
//서브클래스에서 모두 사용 가능, 여러개의 인터페이스를 상속받을 수 있음

interface Runner{ //인터페이스 만들기
    fun run()
}
interface Eater{
    fun eat(){
        println("음식을 먹습니다 ")
    }
}

class Dog2:Runner,Eater{ //인터페이스 상속받을 떄 : 로, 여러개면 , 로.
    override fun run() {
        println("우다다다 뜁니다.")
    }

    override fun eat() {
        println("허겁지겁 먹습니다")
    }
}

//오버라이드 : 이미 구현이 끝난 함수를 서브클래스에서 변경해야할 떄 사용
//추상화 : 형식만 선언, 실제 구현은 서브클래스에 임의할 떄 사용
//인터페이스 : 여러개의 기능을 물려주어야할 때 유용한 기능
