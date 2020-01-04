package chapter11.alsoTest

fun main(){
    data class Person(var name:String, var skills:String)
    var person = Person("Kildong","Kotiln")
    val a = person.let {
        it.skills = "Andorid"
        "succress" }
    println(person)
    println("a: $a")

    val b = person.also {
        it.skills="Java"
        "success"
    }
    println(person)
    println("b : $b")

}