package com.example.hellokotlin

fun main(){
    var s = Second()
    s.a=10;
    s.show()

    var p = Person("SAM",20)
    p.show()

    val stu = Student("robin",25,"android")
    stu.show()
    println()

    val alba = AlbaStudent("Hong",24,"kotlin","PC매니져")
    alba.show()
    println()
}

open class First{
    var a:Int=10

    open fun show(){
        println("a: $a")
    }
}

//First를 상속받은 클래스 [상속문법 : extends]
class Second : First(){
  var b:Int =20
    override fun show(){
        super.show()
        println("b : $b ")
    }

}

