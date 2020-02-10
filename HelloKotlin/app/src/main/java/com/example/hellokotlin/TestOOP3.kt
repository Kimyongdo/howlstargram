package com.example.hellokotlin

fun main(){
 var obj = AAA()
    var obj2 =obj.instancestateBBB();
    obj2.show()


    var c=Test()
    c.onclick()

    var a = object : clickable {
        override fun onclick() {
            println("Anoymous class ")
        }
    }
    a.onclick()

}

interface clickable{
    fun onclick()
}



class Test:clickable{
    override fun onclick() {
        println("click!!!")
        println()
    }
}


class AAA{
    var a:Int =10
    fun show(){
        println("AAA클래스의 show!!")
    }

    fun instancestateBBB():BBB{
        return BBB()
    }

    inner class BBB(){
        fun show(){
            println("아웃터 클래스의 프로터티 a: $a")

            this@AAA.show()
        }

    }



}
