package chapter5

open class Base{
    open val x:Int =1
    open fun f()= println("Base calss f()")
}

class Child:Base(){
    override val x:Int = super.x+1
    override fun f() = println("child class f()")

    inner class inside{
        fun f() = println("inside Class f()")
        fun test(){
            f()
            Child().f()
            super@Child.f()
            println("[inside] super@Childx: ${super@Child.x}")
        }
    }
}

fun main(){

    val c1 = Child()
    c1.inside().test()
    println(c1.x)
}

