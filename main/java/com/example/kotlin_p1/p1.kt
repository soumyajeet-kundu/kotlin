package com.example.kotlin_p1

import androidx.annotation.IntegerRes
import java.util.*

//fun main(){
//    var i: String = "soumya";
//    val text1 ="""
//             Welcome
//                 To
//           JavaTpoint
//    """  ;
//    println("hello " + text1);
//}


//fun main(args: Array<String>){
//    var number = 5
//    var numberProvided = when(number) {
//        1 -> "One"
//        2 -> "Two"
//        3 -> "Three"
//        4 -> "Four"
//        5 -> "Five"
//        else -> "invalid number"
//    }
//    println("You provide $numberProvided")
//}


//fun main()
//{
//    for(i in 1..100 step 25)
//        print("\n$i")
//}


//fun main(args: Array<String>){
//    var number = 7
//    when(number) {
//        1 -> {
//            println("Monday")
//            println("First day of the week")
//        }
//        7 -> println("Sunday")
//        else -> println("Other days")
//    }
//}


//fun main() {
//    val a = Scanner(System.`in`)
//    println("enter your age : ")
//    var age = a.nextInt()
//    when (age) {
//        in 1..17 -> print("not eligible")
//        else ->
//            print("eligible")
//    }
//}


//fun main(){
//    println("enter the first number : ")
//    var a : Int = Integer.valueOf(readLine());
//    println("enter the first number : ")
//    var b : Int = Integer.valueOf(readLine());
//    var c : Int = (a+b)
//    println("sum is : $c")
//}


fun myfun( name:String = "soumya",  age:Int= 20){
    println(name)
    println(age)
}

fun main(){
    myfun(name="soumyajeet")
}


//fun main(){
//    var lam : (Int, Int)-> Int = {x, y -> x+y}
//}
