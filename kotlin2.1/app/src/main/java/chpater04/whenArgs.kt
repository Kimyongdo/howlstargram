package chpater04

fun main(){

    print("enter the score:")
    val score = readLine()!!.toDouble()
    var grade ='C'

    //범위연산자를 사용함.
    when(score){
        in 90.0..100.0 ->grade='A'
        in 80.0..89.9 ->grade='B'
        in 70.0..79.9->grade='C'
        !in 70.0..100.0->grade='F'
    }
    //점으로 나눌 수 있다. when값을 변수로 받는다.
    val msg = when(score){
        90.0, 100.0 -> "Good"
        else -> "Not Bad"
    }

    println("scroe : $score, Grade: $grade, stauts : $msg")
}