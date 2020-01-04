package chapter2

fun main(){

    checkArg("HELLO")
    checkArg(5)
}

fun checkArg(x:Any){
    if(x is String){
        println("x is String : $x")//x is String : HELLO
    }
    if (x is Int){
        println("x is Int: $x")//x is Int: 5
    }
}