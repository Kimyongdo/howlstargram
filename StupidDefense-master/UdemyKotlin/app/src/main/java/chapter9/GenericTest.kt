package chapter9.genericTest

class Box<T>(t:T){
    var name =t
}

fun main(){
    val box1:Box<Int> = Box<Int>(1)
    val box2:Box<String> = Box<String>("Hello")
    val box3 = Box("ASDF")
    println(box1.name)
    println(box2.name)
    println(box3.name)
}