package chpater04

class InvalidnameException(message:String):Exception(message)



fun main(){
    var name = "Kildong123"
    try {
        validateName(name)
    }catch (e :InvalidnameException){
        println(e.message)
    }

}

fun validateName(name:String){
    if(name.matches(Regex(".*\\d+.*")))
        throw InvalidnameException("오류 발생 : Your name: $name")
}