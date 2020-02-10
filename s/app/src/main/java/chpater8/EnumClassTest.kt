package chpater8

interface Score{
    fun getScore():Int
}

enum class MemberType(var prio:String):Score{
    NORMAL("Thrid"){
        override fun getScore(): Int =100
    },
    SILVER("Second"){
        override fun getScore(): Int = 500
    },
    GOLD("First"){
        override fun getScore():Int = 1500
    }
}

fun main(){
    println(MemberType.NORMAL.getScore())//100
    println(MemberType.SILVER.getScore())//500
    println(MemberType.GOLD.getScore())//1500
    println()

    println(MemberType.GOLD)//GOLD
    println(MemberType.valueOf("SILVER"))//SILVER
    println(MemberType.SILVER.prio)//Second



    println()
   for(grade in MemberType.values()){
       println("grade.name = ${grade.name}, prio=${grade.prio}")
   }
}