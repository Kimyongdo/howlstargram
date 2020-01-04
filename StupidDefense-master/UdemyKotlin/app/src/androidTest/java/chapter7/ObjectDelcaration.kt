package chapter7.OCustomer

//(1)obejct키워드를 사용한 방식
object OCustomer{
    var name = "Kildong"
    fun greeting() = println("Hello World")
    val HOBBY = Hobby("BaskerBall")
    init {
        println("init!")
    }
}
class Hobby(val name:String)

fun main(){
    OCustomer.greeting()
    OCustomer.name="Dooly"
    println("name = ${OCustomer.name}")
    println(OCustomer.HOBBY.name)

}
