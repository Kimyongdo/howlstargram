package chpater6.private

private class PrivateClass{
    private var i =1
    private fun privateFunc(){
        i +=1
    }
    fun access(){
        privateFunc()
    }
}

class Otehrclass{
   // val opc = PrivateClass()//private이므로 오류
    fun test(){
        val pc = PrivateClass()
    }
}


fun main(){
    val pc = PrivateClass()
   // pc.i
    //pc.privateFunc()
}

fun TopFunction(){
    val tpc = PrivateClass()

}

