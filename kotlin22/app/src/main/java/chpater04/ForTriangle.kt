package chpater04

fun main(){
 print("Enther the Lines : ")
    val n = readLine()!!.toInt()
    for(line in 1..n){
        for(space in 1..(n-line)) print(" ")
        for(start in 1..(2*line-1)) print("*")
        println()
    }
}