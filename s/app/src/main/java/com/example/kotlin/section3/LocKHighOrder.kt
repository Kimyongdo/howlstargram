package com.example.kotlin.section3

import java.util.concurrent.locks.ReentrantLock

fun <T> lock(reLock:ReentrantLock, body:()->T):T{
    reLock.lock()
    try {
        return  body()
    }finally {
        reLock.unlock()
    }
}

var sharable = 1
fun main(){
    val reLock = ReentrantLock()
    lock(reLock, {criticalFunc()})
}

fun criticalFunc(){
    //공유자원접근코드사용
    sharable++
}