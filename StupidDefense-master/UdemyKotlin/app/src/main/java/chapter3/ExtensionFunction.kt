package chapter3.ExtensionFunction

fun main(){
    val source="Hello World"
    val target="Kotlin"
    val target2 = "Kotlin Kotlin Kotlin Kotlin "
    println(source.getLongString(target))
    println(source.getLongString2(target2))
}

//String을 확장해 getLongString을 추가
fun String.getLongString(target:String):String=
    if(this.length>target.length) this else target

fun String.getLongString2(target2:String):String=
    if(this.length>target2.length) this else target2