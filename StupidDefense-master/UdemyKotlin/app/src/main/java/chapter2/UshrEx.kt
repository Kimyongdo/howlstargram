package chapter2

fun main(){
    val number1 =5 //0101
    val number2 =-5 //기존을 다 바꾸면 111..1010+1 => 111..1011이 -5

    println(number1 shr 1) // 5 -> 0101 -> 0010 => 2
    println(number1 ushr 1)// 5-> 0101 -> 0010 양수부호는 의미가 없다.
    println(number2 shr 1) //부호비트 1유지 111....0100으로 -3이 나옴
    println(number2 ushr 1) //부호비트가 0으로 되면서 큰 수가 나옴.
    

}