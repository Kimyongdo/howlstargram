package com.example.kotlin.section3.highorder1

fun main(){
  var result:Int

   //람다식을 매개변수와 인자로 사용한 함수
   result= highorderTest({x,y->x+y},10,20)
    println(result)


    val multi = {x:Int, y:Int -> x*y}
    val multi2:(Int, Int) -> Int = {x,y->x*y}
    val greet:() -> Unit = { println("Hello")}
    val nestedLamda:() -> ()->Unit = {{ println("hi nice to meet you")}}
    val nestedLamda2:() -> ()->Int = {{20}}

    result = multi(10,20) // 람다식을 함수  처럼 사용
    println(result)
    greet() //Hello
    nestedLamda()() //람다 안에 람다 사용방법
    val test = nestedLamda2()()
    println(test)

}

fun highorderTest(sum:(Int,Int)->Int, a:Int, b:Int):Int{
    return sum(a,b)
}
