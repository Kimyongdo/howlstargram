package chpater7.getterSetter

class User(_id:Int, _name:String, _age:Int){
    //프로퍼티
    val id:Int = _id
    get()=field

    var name:String=_name
    get()=field
    set(value){
        field=value
    }

    var age:Int = _age
    get() = field
    set(value) {
        field=value+10 //value =35가 들어온뒤 +10을 따로 해줌 커스텀 완료.
    }
}

fun main(){
    val user1 = User(1,"Kildong",30)
    //user1.id=2 //val은 setter불가능
    user1.age=35 //setter동작
    println("user.age = ${user1.age}") //게터 동작
}