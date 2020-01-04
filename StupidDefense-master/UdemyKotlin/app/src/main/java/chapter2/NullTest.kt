package chapter2

fun main(){
    var str1:String? = "Hello Kotlin"
    var num:Int? = null
   str1 = null
    println("str1: $str1, num:$num ")//str1: null, num:null
    println("str1: $str1 , length:${str1?.length}")//str1: null , length:null
    //println("str1: $str1 , length:${str1!! .length}")//NPE발생

    val len = if(str1!=null) str1.length else -1
    println("str1:$str1 length: $len")//tr1:null length: -1

    println("str: $str1 length: ${str1?.length ?: -11}")

}