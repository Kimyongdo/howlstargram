package com.example.hellokotlin

open class Student constructor(name:String, age:Int, var major:String) : Person(name,age){
    init {
        println("Create:Studnet Instance")
    }

    override fun show() {
        println("name: $name age:$age major:$major")
    }

}