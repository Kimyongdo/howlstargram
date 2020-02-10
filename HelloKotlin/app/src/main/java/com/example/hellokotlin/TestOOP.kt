package com.example.hellokotlin

fun main(){
    println("Hello Kotlin OOP")
    var obj = Myclass()
    obj.show()

    var obj2 = MyKotlinClass()
    obj2.show()

    var s= Simple()
    var s2 = Simple2(100)

    var s3 = Simple3()

    var s5 = Simple4()
    var s6 = Simple4(1000)
}

class Simple4 constructor(){
    init {
        println("Simple444444")
    }


    constructor(num:Int):this(){
        println("simple4 constructor")
    }
}

class Simple3{
    constructor(){
        println("Simple3 Secondary")
    }

    init {
        println("객체생성, 초기화. 항상 실행")
    }

    constructor(num: Int){
        println("Simple3 secondaty 생선자 : $num")
        println()
    }
}

class Simple2 constructor(num:Int){
    init {
        println("Simple2 primary2 : $num")
        println()
    }

    fun show(){
        println()
    }
}


 class Simple constructor(){


     init {
         println("simple primary constructor")
     }

 }


class Myclass{
var a:Int =10
    fun show(){
        println("show : $a")
    }

}