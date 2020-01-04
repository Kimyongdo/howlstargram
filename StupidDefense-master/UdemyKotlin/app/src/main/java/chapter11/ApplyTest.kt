package chapter11.ApplyTest

import kotlin.math.ln


fun main(){
    data class Person(var name:String, var skills:String)
    var person = Person("Kildong","Kotiln")

    person.apply { this.skills = "Swift" }
    println(person)

    val returnObj = person.apply {
        name="Sean"
        skills="JAVA"
    }

    println(person)
    println(returnObj)
}