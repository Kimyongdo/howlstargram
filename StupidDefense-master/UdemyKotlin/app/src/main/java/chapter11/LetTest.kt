package chapter11

fun main(){
 val score:Int? =32
    // val scroe = null

    fun checkScore(){
        if(score!=null){
            println("Scroe : $score")
        }
    }

    fun checkSocoreLet(){
        score?.let { println("score : $it") }
        var str = score.let { it.toString() }
        println(str)
    }

    checkScore()
    checkSocoreLet()
}