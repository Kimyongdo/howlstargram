package chapter6.protected

open class Base{
    protected var i =1
    protected fun protectedFunc(){
        i +=1
    }
    fun access(){
        protectedFunc()
    }
    protected class Nested
}

class Derived:Base(){
    var j= 1+i //상속계열이기에 i를 사용할 수 있음.
    fun test():Int{
        protectedFunc()
        return i
    }
}

class Other{
    fun other(){
        val base = Base()
        //base.i=3 - 여긴 상속계열이 아니라서 불가능
    }
}

fun main(){
    val base = Base()//생성은 할 수 있으나. 직접 호출 불가능
  //  base.i
  //  base.protectedFunc() //불가능.
    base.access()//public 으로 호출 가능

    val derived=Derived()
    derived.j=3 //j는 public
    derived.test()
}

