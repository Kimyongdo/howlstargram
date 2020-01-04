package chapter6.private

private class PrivateClass{
    private var i =1
    private fun privateFunc(){
        i +=1
        println(i)
    }
    fun access(){
        privateFunc() //public access를 이용해서 privateFunc() 활용가능
    }
}

class Otehrclass{ //아무런 내용을 쓰지 않았으니 public class
    //val opc = PrivateClass()//private이므로 오류
    fun test(){
        val pc = PrivateClass() //public test()안에 PrivateClass()는 가능
        //pc.i
        //pc.privateFunc()
        pc.access() //가려져있는 상태
    }
}


fun main(){
    val pc = PrivateClass() //main에서 private 함수 객체는 소환가능 이용은 별도
  //  pc.i
  //  pc.privateFunc() //private접근불가
    pc.access()//외부에서는 public메서드 통해서만 접근

}

fun TopFunction(){
    val tpc = PrivateClass() //top level 이라서 가능 class에서는 불가능

}

