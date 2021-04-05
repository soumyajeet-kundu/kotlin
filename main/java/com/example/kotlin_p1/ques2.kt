package com.example.kotlin_p1

fun main(){
    var pie : Float = 3.14f
    println("enter the radius of the circle : ")
    var rad: Int = Integer.valueOf(readLine());

    var area = (pie*(rad*rad))
    var peri : Float = (2*pie*rad)
    println("area of the circle is : $area")
    println("perimeter of the circle is : $peri")

    var side : Float = (peri/4);
    println("side of the square is: $side")
}