package chapter8.CatandDog

interface Pet{
    val category:String
    val msgTags:String
    get() = "i'm your lovely dog"

    fun feeding()
    fun pattring(){
        println("Keep patting!")
    }
}

open class Animation(val name:String)

class Dog(name:String, override val category: String) : Animation(name),Pet {
    override fun feeding() {
        println("Feed the dog bone")
    }
}

class Cat(override var category: String) : chapter8.interface01.Pet {
    override fun feeding() {
        println("Feed the cat a tuna can!")
    }
}

class Master{
    fun playWithPer(dog:Dog){
        println("Enjoy with my dog")
    }
    fun palyWithPet(cat:Cat){
        println("Enjoy with my cay")
    }
}
fun main(){

}