package com.example.kotlin_p1

fun main() {
    println("-------------enter marks out of 100--------------")
    println("enter marks1 : ")
    var a: Int = Integer.valueOf(readLine());
    println("enter marks2: ")
    var b: Int = Integer.valueOf(readLine());
    println("enter marks3: ")
    var c: Int = Integer.valueOf(readLine());

    var total= (a+b+c);
    var per : Float = (total/3).toFloat();
    println("total marks = $total and percentage is = $per")
}