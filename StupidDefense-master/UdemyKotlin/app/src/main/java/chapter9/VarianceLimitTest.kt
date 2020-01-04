package chapter9

open class Animal(val size:Int){
    fun feed()= println("Feeding...")
}

class Cat(val jump:Int):Animal(50)
class Spider(val poison:Boolean):Animal(1)

class Box<out T:Animal>(val element: T){
    fun getAnimal():T =element
//    fun set(new:T){
//        element = new
//    }
}

fun main(){
    val c1:Cat = Cat(10)
    val s1:Spider= Spider(true)

    //클래스위 상위자료형 변환이 가능
    var a1:Animal = c1
    a1=s1
    println("a1.size : ${a1.size}")

    //공변성 Cat은 Animal의 하위자료형
    val c2:Box<Animal> = Box<Cat>(Cat(10))
    println(c2.element.size)

//    val c3:Box<Cat> = Box<Animal>
//    val c4:Box<Any> = Box<Int>(2)
}
