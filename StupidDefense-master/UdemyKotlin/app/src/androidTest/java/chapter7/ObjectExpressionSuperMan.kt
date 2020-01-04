package chapter7.superman

open class Superman{
    fun work() = println("asdf")
    fun talk() = println("qwer")
    open fun fly() = println("][po")

}


fun main(){
    val pretendedMan=object:Superman(){
        override fun fly() = println("i'm asdf")
    }
    pretendedMan.work()
    pretendedMan.talk()
    pretendedMan.fly()

}