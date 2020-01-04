package chapter3

fun main(){
    val name="홍길동"
    val email="giyo1128@naver.com"
    add(name)
    add("둘리","asdf@naver.com")
    defaultArgs()
    defaultArgs(200)

}

fun add(name:String, email:String="defult"){
    val output="${name}님의 이메일은 ${email}입니다."
    println(output)
}

fun defaultArgs(x:Int=100, y:Int=200){
    println(x+y)
}