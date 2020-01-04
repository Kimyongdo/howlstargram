package chapter12

class SimpleThred:Thread(){
    override fun run(){
        println("Current Threads1: ${Thread.currentThread()}")
    }
}

class SimpleRunnable:Runnable{
    override fun run() {
        println("Current Threads2: ${Thread.currentThread()}")
    }
}

fun main(){
    val thread = SimpleThred()
    thread.start()
    val runnable = SimpleRunnable()
    val thread1 = Thread(runnable)
    thread1.start()

    //익명객체
    object :Thread(){
        override fun run() {
            println("object Thraed : ${Thread.currentThread()}")
        }
    }.start()

    //람다
    Thread{
        println("Lambda Thread ${Thread.currentThread()}")
    }.start()
}