package chpater7.DelegatedClass

interface Car{
    fun go():String
}

class Vanlmpl(val power:String):Car{
    override fun go() ="는 짐을 적재하며 $power 마력을 가집니다."
}

class Sportlmpl(val power:String):Car{
    override fun go()="는 경주용에 사용되며 $power 마력을 가집니다."
}

class CarModel(val model:String, impl:Car):Car by impl {
    fun carInfo(){
        println("$model ${go()}")
    }
}

//by를 쓰지 않고 interface를 상속받으면 class의 내용들을 받지 못 한다.
class CarModel2(val model:String, impl:Car):Car  {

    override fun go(): String{
        return "Test" //InterfaceString이므로 String값 써야함.
    }

    fun carInfo(){
        println("$model ${go()}")//내부에서 오버라이드한 go()가 발동.
    }


}

//
class CarModel3(val model:String, val impl:Car):Car  { //

    override fun go(): String{
        return "Test"
    }
    fun carInfo(){
        println("$model ${impl.go()}") //impl.go()로 하면 ovrride말고 매개변수껄 사용한다.
    }
}

fun main(){

    val myDamas = CarModel("Damas 2010", Vanlmpl("100마력"))//위임
    val my350z = CarModel("350Z 2008", Sportlmpl("350마력"))//위임
    myDamas.carInfo()
    my350z.carInfo()
    val asdf = CarModel2("asdf",Sportlmpl("350마력")) //interface ovrride
    asdf.carInfo()
    val asdf2 = CarModel3("asdf",Sportlmpl("350마력")) //직접 클래스 사용
    asdf2.carInfo()
}

