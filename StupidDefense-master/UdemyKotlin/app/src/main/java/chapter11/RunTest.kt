package chapter11.runTest

fun main(){
    data class Person(var name:String, var skills:String)
    var person = Person("Kildong","Kotiln")

    val a = person.run {
        name="Sean"
        skills="Android"
        "success"
    }

    println(a)
    println(person)
}