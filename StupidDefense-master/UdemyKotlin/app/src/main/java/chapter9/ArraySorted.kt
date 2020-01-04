package chapter9.sort

import java.util.*

fun main(){
    val arr = arrayOf(8,4,3,2,5,9,1)
    val sortNum = arr.sortedArray()
    println("ASC : ${Arrays.toString(sortNum)}")

    val sortNumDesc = arr.sortedArrayDescending()
    println("ASC : ${Arrays.toString(sortNumDesc)}")

    arr.sort(1,3)
    println("ORI:"+Arrays.toString(arr))
    arr.sortDescending()
    println("ORI : "+Arrays.toString(arr))

    val listed:List<Int> = arr.sorted()
    val listedDesc:List<Int> = arr.sortedDescending()
    println("list"+listed)
    println("listDesc"+listedDesc)

    val items = arrayOf("dog","cat","lion","kangaroo","po")
    items.sortBy { item -> item.length}
    println(Arrays.toString(items))

    val products = arrayOf(
        Product("Snowball", 870.00),
        Product("Phone", 999.00),
       Product("drone", 240.00),
          Product("mouse", 333.00),
           Product("keyboard", 125.00),
       Product("monitor", 1500.00),
      Product("tablet", 512.00)

    )

    products.sortBy { it.price }
    products.forEach { println(it) }
    println()

    products.sortWith(
        Comparator<Product>{p1,p2->
            when{
                p1.price>p2.price -> 1
                p1.price==p2.price -> 0
                else -> -1
            }

        }
    )
    products.sortWith(compareBy({it.name},{it.price}))
    products.forEach { println(it) }
    println()

    //가장 큰 값 가장 작은 값
    println(products.minBy { it.price })
    println(products.maxBy { it.price })

    //flatten

    val numbers = arrayOf(1,2,3)
    val strs = arrayOf("one","two","three")
    val simple = arrayOf(numbers,strs)
    simple.forEach { println(it) }
    val faltten = simple.flatten()
    println(faltten)
}

data class Product(val name:String, val price:Double)
