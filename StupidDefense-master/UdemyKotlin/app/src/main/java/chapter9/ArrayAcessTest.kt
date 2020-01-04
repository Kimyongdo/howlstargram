package chapter9.array

import java.util.*


fun main(){
    val arr = intArrayOf(1,2,3,4,5)
    println("arr : ${Arrays.toString(arr)}")
    println("size : ${arr.size}")
    println("sum() : ${arr.sum()}")

    println(arr.get(2))
    println(arr[2])

    println(arr.set(2,7))
    arr[0]=8
    println(arr[0])

    for(i in 0..arr.size-1){
        println("${arr[i]}")
    }
}