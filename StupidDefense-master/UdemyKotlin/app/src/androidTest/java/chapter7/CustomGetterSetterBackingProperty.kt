package chapter7.backingproperty

class User(_id:Int, _name:String, _age:Int){
    val id:Int =_id
    private var tempName:String?=null
    var name:String=_name
    get() {
        if(tempName==null) tempName="NONAME"
        return tempName?:throw AssertionError("Asserted by others")
    }
    var age:Int=_age

    fun asdf(){
        tempName="asdf"
    }
}
fun main(){
    val user1 = User(1,"kildong",35)
    user1.name="ASBC" //여기서 바꾼다 한들 Custom 되어서 tempName의 영향만을 받는다
    user1.asdf()
    println("user.name = ${user1.name}")
}