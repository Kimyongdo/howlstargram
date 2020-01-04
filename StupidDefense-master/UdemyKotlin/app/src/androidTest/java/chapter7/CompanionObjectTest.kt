package chapter7.companion


class Person{
    var id:Int =0
    var name:String ="YoungDeok"
    companion object{
        var language:String="Korean"
        fun work(){
            println("working...")
        }
    }
}


fun main() {
//    val person = Person() 생성 없이도 companion object로 인해 이 부분은 이용가능하다.

    println(Person.language)
    Person.language = "English"
    println(Person.language)
    Person.work()
//    println(person.name)
}