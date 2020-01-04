package chapter7.personTest

class Person(_id:Int, _name:String, _age:Int){

    //프로퍼티들
    var id:Int=_id
    var name:String=_name
    var age:Int=_age
}

//좀 더 간략표현
class Person2(var id:Int, val name:String, val age:Int)

fun main(){
    val person =Person2(1,"Kildong",30)
    //내부적으로는 getter와 setter를 발생
    person.id=2 //setter
    println(person.id)//getter


}

