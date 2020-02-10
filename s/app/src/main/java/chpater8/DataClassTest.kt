package chpater8.dataclass

data class Cusomter(var name:String, var email:String){

    var job:String = "Unknown"

    //부생성자 사용시 this 필요함. job은 부생성자만의 매개변수에서 추가됨.
    constructor(name:String, email:String, _job:String):this(name,email){
        job=_job
    }

    init {
        this.name="Mr/Ms" + this.name
    }
}



fun main(){
  val cus1 = Cusomter("Kildong","kil@mail.com")
    println(cus1)//Cusomter(name=Mr/MsKildong, email=kil@mail.com)
    //디스럭쳐링방법.
    //val()
    val(name, email)= cus1//name: Mr/MsKildong, email : kil@mail.com
    println("name: $name, email : $email")
    //컴포넌트
    val n1 =cus1.component1()
    val n2 = cus1.component2()
    println("name: $n1, email : $n2")

    val lam1 ={
        (name,email):Cusomter->
        println(name)//Mr/MsKildong
        println(email)//kil@mail.com
    }

    lam1(cus1)

}