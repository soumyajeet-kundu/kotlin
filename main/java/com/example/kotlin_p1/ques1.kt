package com.example.kotlin_p1

fun main() {
    println("enter the first number : ")
    var a: Int = Integer.valueOf(readLine());
    println("enter the second number : ")
    var b: Int = Integer.valueOf(readLine());

    var add = (a+b);
    var sub = (a-b);
    var mul = (a*b);
    var div = (a/b);

    println("addition of two numbers is  = $add");
    println("subtraction of two numbers is  = $sub");
    println("multiplication of two numbers is  = $mul");
    println("division of two numbers is  = $div");
}

