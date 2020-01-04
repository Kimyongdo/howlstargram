package chapter6.internal

//module 기준
internal class InternalTest{
    internal  var i =1
    internal fun internalFunc(){
        i+=1
        println(i)
    }
}

class Other{
    private val it = InternalTest()//internal을 안쓰면 불가 -> private을 쓰는걸 권장
    fun test(){
        it.i=3
        it.internalFunc()
    }
}

fun main(){
    val it = InternalTest()
    it.i =10
    it.internalFunc()
}
