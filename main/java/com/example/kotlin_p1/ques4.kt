package com.example.kotlin_p1

fun main(){
    print("enter the quantity : ")
    var quantity: Int = Integer.valueOf(readLine());
    print("enter price: ")
    var price: Int = Integer.valueOf(readLine());

    var actual : Float = (quantity*price).toFloat();
    var total = (actual*85)/100;
    println("---discount of 15% is applied---")
    println("your total price is : $total")
}



//fun main() {
//    val arr = arrayListOf(4, 6, 7, 1, 100, 5)
//    println("Minimum: ${arr.min()}")
//    println("Maximum: ${arr.max()}")
//}

