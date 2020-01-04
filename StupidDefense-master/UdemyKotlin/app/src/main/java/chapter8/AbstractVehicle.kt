package chapter8.abstractVehicle


//추상클래스, 주생성자에는 비추상 프로퍼티 선언의 매개변수 3개가 있음

abstract class Vehicle(val name:String, val color:String, val weight:Double){

    //추상프로퍼티(반드시 하위클래스에서 재정의 초기화해야함
    abstract var maxSpeed:Double

    //일반 프로퍼티(초기 값인 상태를 저장할 수 있음
    var year ="2018"

    //추상메서드(반드시 하위클래스에서 구현해야함
    abstract fun start()
    abstract fun stop()

    //일반메서드
    fun dislaySpecs(){
        println("Name $name, Color : $color, Weight:$weight, Year:$year, Max Speed: $maxSpeed")
    }
}

class Car(name:String, color:String, weight: Double,override var maxSpeed:Double):Vehicle(name,color,weight){
    override fun start() {
        //코드의 구현
        println("Car Started")
    }

    override fun stop() {
        //코드의 구현
        println("Car stopped")
    }
}

class Motorcycle(name:String, color:String, weight: Double,override var maxSpeed:Double):Vehicle(name,color,weight){
    override fun start() {
        //코드의 구현
        println("Bike Started")
    }

    override fun stop() {
        //코드의 구현
        println("Bike stopped")
    }
}

fun main(){
    val car = Car("SuperMatiz","yellow",1110.0,270.0)
    val motor = Motorcycle("DreamBike","Red",173.0,100.0)
    car.year="2013"

    car.dislaySpecs()
    car.start()

    motor.dislaySpecs()
    motor.start()




}