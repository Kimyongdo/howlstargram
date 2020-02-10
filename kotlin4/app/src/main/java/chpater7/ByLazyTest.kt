package chpater7.ByLazy

class LazyTest{
    init {
        println("init book")
    }
    val subject by lazy {
        println("lazy initialized")
        "Kotlin Programming"
    }

    fun flow(){
        println("not initialized")
        println("subject one:$subject")
        println("subject two :$subject")
    }

}

fun main(){
    val test = LazyTest()
    test.flow()

}

