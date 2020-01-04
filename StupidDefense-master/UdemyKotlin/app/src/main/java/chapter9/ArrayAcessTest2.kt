package chapter9.arrayacessTest2

import java.util.*


fun main(){
    val b = Array(10,{0})
//    b[0]="Hello world" 이미 정수형으로 초기화됨.
//    b[1]=1.1 float불가.
    //이를 방지하기 위해서
    val c = Array<Any>(10,{0})
    c[0]="Hello world"
    c[1]=1.1
    println(Arrays.toString(b))
    println(Arrays.toString(c))
}