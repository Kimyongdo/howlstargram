package chapter5.section3.override


open class Bird(var name:String, var wing:Int, var beak:String, var color:String){
    fun fly()= println("Fly wing: $wing")
    open fun sing(vol:Int)= println("Sing vol : $vol")

}

class Parrot (name:String, wing:Int=2, beak:String, color:String, var language:String="natural"):Bird(name,wing,beak,color){
    fun speak()= println("Speaking $language")
    override fun sing(vol: Int) {
        super.sing(vol)
        println("i'm a Parrot $vol")
        speak()
    }

}


fun main(){
    val parrot = Parrot("myparrot",2,"short","multiple","korean")
    parrot.speak()
    parrot.sing(3)
}