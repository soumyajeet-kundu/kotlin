package com.example.kotlin_p1

import java.util.*

fun main()
{
    val sc = Scanner(System.`in`)
    println("Enter the nth term : ")
    var n= sc.nextInt()
    var a=0
    var b=1

    print("$a $b")
    var k=0
    n=n-2
    for(i in 1..n)
    {
        k=a+b
        print(" $k")
        a=b
        b=k
    }
}