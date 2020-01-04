package chapter5.section1.bird2

class Bird constructor(_name:String, _wing:Int, _beak:String, _color:String){
    var name:String=_name
    var wing:Int=_wing
    var beak:String=_beak
    var color:String=_color

    init{
        println("간단한 코드 작성 가능 실행과 동시 발동 ")
    }

    fun fly()= println("Fly $wing")
    fun sing(vol:Int)= println("Sing $vol")
}

//가시성지시자, 어노테이션이 없는 경우 constructor 생략가능
class Bird2(_name:String, _wing:Int, _beak:String, _color:String){
    var name:String=_name
    var wing:Int=_wing
    var beak:String=_beak
    var color:String=_color

    fun fly()= println("Fly $wing")
    fun sing(vol:Int)= println("Sing $vol")
}

//프로퍼티를 주생성자 생성하면서 같이 만들기.> 코드축약이 가능함.
class Bird3(var name:String="noname", var wing:Int=3, var beak:String, var color:String){
//    var name:String=_name
//    var wing:Int=_wing
//    var beak:String=_beak
//    var color:String=_color
    //안써도 ok

    fun fly()= println("Fly $wing")
    fun sing(vol:Int)= println("Sing $vol")
}

fun main(){
    val coco= Bird("mybird",2,"long","yellow")
    println("coco.name : ${coco.name}")
    println("coco wing : ${coco.wing}")

    //클래스 프로퍼티에 값이 있는 경우 없는 것만 찾아서 넣어준다.
    val coco2 = Bird3(beak="longbeak",color = "red")
    println("coco2 beak : ${coco2.beak}")
    println("coco2 color : ${coco2.color}")


}