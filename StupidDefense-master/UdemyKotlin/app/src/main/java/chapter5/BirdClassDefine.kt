package chapter5.birdcalss

fun main(){
    val coco = Bird()
    coco.color="yellow"
    println(coco)
    println("coco.color : ${coco.color}")
    coco.fly()
    coco.sing(3)

}

class Bird(){
    val name:String="mybird"
    val wing:Int = 2
    var beak:String = "short"
    var color:String = "blue"

    fun fly()= println("Fly wing : $wing")
    fun sing(vol:Int)= println("Sing vol : $vol")
}