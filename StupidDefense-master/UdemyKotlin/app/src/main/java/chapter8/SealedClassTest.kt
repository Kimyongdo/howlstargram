package chpater8.sealedClass

sealed class Result{
        open class Success(val message:String):Result()
        class Error(val code:Int, val message:String):Result()
}

class Status:Result() //실드 클래스 상속은 같은 파일에서만 가능
class inside: Result.Success("Status")

fun main(){
    //Success에 대한 객체 생성
    val result = Result.Success("Good")
    val msg = eval(result)
    println(msg)

    val error = Result.Error(10,"Bad")
    val msg2 = eval2((error))
    println(msg2)
}

fun eval(result:Result):String=when(result){
    is Status->"in progress"
    is Result.Success -> result.message
    is Result.Error -> result.message
    //모든 조건을 가지므로 else가 필요 없음.
}

fun eval2(error:Result):String=when(error){
    is Status->"in progress"
    is Result.Success -> error.message
    is Result.Error -> error.message
    //모든 조건을 가지므로 else가 필요 없음.
}
