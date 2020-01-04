package chpater8.innerClass

interface Switcher{ //인터페이스 선언
    fun on():String//구현하는 주체는 필요하다.
    // interface -> 자동으로 abstract가 있다.
    //원래 하위클래스 정의후 오버라이딩 한 다음에 객체를 생성해야함
    //:String까지 써줘야함.
    // fun on():String = "asdfasdf"이라고 한다면 일반메소드가 되어버림.
}

class SmartPhone(val model:String){
    private  val cpu = "Exyon"

    //중첩클래스
    class aaa

    fun powerOn():String{
        //지역클래스
        class Led(val color:String){
            fun blink():String = "Blinking $color on $model"
        }
        //지역함수
        val powerStatus = Led("Red")
        //익명객체 표현식
        val powerSwicher = object:Switcher{
            override fun on(): String {
                 return powerStatus.blink()
            }
        }
        return powerSwicher.on()
    }

    //이너클래스
    inner class ExternalStorage(val size:Int){
        fun getInfo()="${model} installed on $cpu with ${size}Gb"
    }

}


fun main(){
    val mySdCard = SmartPhone("s7").ExternalStorage(37 )
    println(mySdCard.getInfo())

    val myphone = SmartPhone("Note9")
    myphone.ExternalStorage(128)
    println(myphone.powerOn())

}