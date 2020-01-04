package chapter2

fun main(){
    //val num=256
    val num=256
    if(num is Int){ //num이 Int형일때
        println(num)
    }else if(num !is Int){ //num이 Int형이 아닐때 !(num is Int)와 동일
        println("Not a Int")
    }
}