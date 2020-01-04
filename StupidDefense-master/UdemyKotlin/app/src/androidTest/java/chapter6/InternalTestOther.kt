package chapter6.internal

//패키지만 같다면 분리되어있는 프로그램파일에서도
//서로 알아들을 수 있는 기능이 internal


class OtherFile{
    fun test(){
        val it = InternalTest()
        it.i=5
        it.internalFunc()
    }
}

fun main(){
    val it = InternalTest()
    val of = OtherFile()
    of.test()
}