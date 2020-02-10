package chpater04

fun main(){
    val a =12
    val b = 7

    //블록과 함꼐 사용
    var max = if(a>b){
        println("a 선택")
        a
    }else{
        println("b선택")
        b
    }

    println(max)
}