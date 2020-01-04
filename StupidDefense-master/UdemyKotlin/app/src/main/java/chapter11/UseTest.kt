package chapter11.UseTest

import java.io.FileOutputStream
import java.io.PrintWriter


fun main(){
    PrintWriter(FileOutputStream("C:\\Temp\\output.text")).use {
        it.println("hello")
    }
}

