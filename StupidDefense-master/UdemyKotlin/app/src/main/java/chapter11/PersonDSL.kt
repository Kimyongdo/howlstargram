package chapter11

data class Person(var name:String?=null, var age:Int?=null, var job:Job?=null)
data class Job(var category:String?=null, var position:String?=null, var extension:String?=null)

fun person(block: (Person)->Unit):Person{
    val p = Person()
    block(p)
    return p
}
//fun Person.


fun person2(block: Person.()->Unit):Person{
    val p = Person()
    p.block()
    return p
}

fun person3(block: Person.()->Unit):Person{
   return Person().apply(block)
}

//리턴값을 지우고 한줄로
fun person4(block: Person.()->Unit):Person=Person().apply(block)


fun main(){
    val person = person{
        it.name="Kildong"
        it.age=20
    }
    println(person)

    //람다식에서 ()밖으로
    val person2 = person2{
//        this.name="Kildong"
//        this.age=20
        name="Kildong"
        age=20
    }
    println(person2)

}
