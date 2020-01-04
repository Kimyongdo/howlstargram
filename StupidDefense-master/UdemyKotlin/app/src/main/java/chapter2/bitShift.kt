package chapter2

fun main(){

    val num=4
    println(num.shl(2)) //4 -> 0100 -> 0001/0000 으로 변경 16
    println(num shl 2) //중위표현식 .과 ()를 제거 위와 같은 값 도출 (infix expression)
    println(num.shr(2)) //4 -> 0100 -> 0001 => 1
    println(num shr 2)//infix 표현식
    println(num.ushr(2))//num이 -4면 부호유지를 하지 않기 떄문에 큰 수가 나온다.

    var x =4
    var y = 0b0000_1010 //10진수 10
    var z = 0x0F //10진수 15

    println("x.shl 2 -> ${x shl 2}") //4 -> 0100 -> 0001/0000 = 16
    println("x.inv -> ${x.inv()}")// 4-> 0100 -> 1011 ->  -5

    println("y.shr 2 -> ${y/4}, ${y shr 2}")//2,2
    println("x. shl 4 -> ${x*16}, ${x shl 4}")//64,64
    println("z shl 4 -> ${z*16}, ${z shl 4}")//240,240

    x=64
    println("x shr 4 -> ${x/4}, ${x shr 2}")//16,16


}