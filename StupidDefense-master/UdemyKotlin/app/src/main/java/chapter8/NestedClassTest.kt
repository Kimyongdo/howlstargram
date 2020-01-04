package chpater8.NestedClass

class Outer{
    val ov=5
    class Nested{
        val nv=10
        fun gretting() = "[Nested Hello] $nv" //외부의 ov에는 접근불가.
        fun acessOuter(){
            println(contury)
            getSomething()
        }
    }

    fun outside(){
        val msg = Nested().gretting() //Outer객체 생성없이 중첩클래스의 메서드 접근
        println("[Outer] : $msg, ${Nested().nv}") //중첩클래스의 프로퍼티 접근
    }

    companion object{
        const  val contury ="Korea"
//        fun getSomething():Unit{
//            return println("Get something")
//        }
        fun getSomething()= println("Get Something")//한줄로 표현가능
    }
}

fun main(){
    //static처럼 outer의 객체 생성없이 Nested객체 생성 사용할 수 있음
    val output = Outer.Nested().gretting()
    println(output)
    //Outer.outside()//에러 outer객체생성필요
    val outer = Outer()
    outer.outside()//korea
    Outer.Nested().acessOuter()//Get something


}