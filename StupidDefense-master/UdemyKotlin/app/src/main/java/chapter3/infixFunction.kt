package chapter3.infixFunction

fun main(){
    //일반표현법
    val multi = 3.multiply(10)
    println(multi)

    //중위표현법
    val multi2 = 3 multiply 10
    println(multi2)
}

infix fun Int.multiply(x:Int):Int{
    //infix로 선언되므로 중위함수
    return this * x
}