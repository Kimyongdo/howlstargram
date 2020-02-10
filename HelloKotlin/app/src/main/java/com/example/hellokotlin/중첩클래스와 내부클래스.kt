package com.example.hellokotlin

fun main(){

    Outer.Nested().introduce() //클래스임에도 ()을 쓰는구만
    val outer = Outer()
    val inner = outer.Inner()
    inner.introduceInner()
    inner.introduceOuter()
    outer.text="Changed Outer Class"
    inner.introduceOuter()
}

class Outer{
    var text="Outer Class"
    class Nested{
        fun introduce(){
            println("Nested class")
        }
    }
    inner class Inner{
         var text ="Inner Class"
        fun introduceInner(){
            println(text)
        }

        //inner클래스 내부에서 outer클래스 변수를 사용할 수 있음.
        fun introduceOuter(){
            println(this@Outer.text ) //같은 이름의 속성이나 함수가 있다면 this@OuterClass이름으로 참조
        }


    }
}


//중첩 클래스 nested class
// 하나의 클래스가 다른 클래스의 기능과 강하게 연관되어있음을 알리기 위해 만든 형식

//중첩클래스 - 형식만 class aaa{class bbb{}}일뿐 외부클래스의 내용을 공유할 수 없음 , 별개의 클래스
//내부클래스 - class aaa{inner class bbb{}} 외부클래스의 속성과 함수 사용이 가능



