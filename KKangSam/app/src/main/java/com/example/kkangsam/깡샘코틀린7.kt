package com.example.kkangsam

fun main(){
  var obj=myclass()
    obj.name
    obj.sayHello()
}

class myclass{
    var name:String="Hello"
    fun sayHello(){
        println("hello $name")
    }
}

class myclass2 constructor(){}