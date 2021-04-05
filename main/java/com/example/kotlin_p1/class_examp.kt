//class and object

package com.example.kotlin_p1
//
//class Account {
//    var ac_no: Int = 0
//    var ac_holder: String = ""
//
//    fun insert(accn: Int, name: String) {
//        ac_no = accn
//        ac_holder = name
//        println("account no: $accn & account holder is : $name")
//    }
//}
//    fun main()
//    {
//        var acc = Account()
//        acc.insert(6546514, "soumya")
//        println("${acc.ac_holder}")
//    }



//// nested class example


//class demo{
//    private var name : String = "soumya"
//    inner class nestedClass{
//        var desc : String = "this is nested class"
//        private var id : Int = 10
//        fun foo(){
//            println("inside function")
//            println("$id")
//            println("$name")
//        }
//    }
//}
//fun main(){
//    println(demo().nestedClass().desc)
//    var obj = demo().nestedClass();
//    obj.foo();
//}



////constructor


//class bio(val name: String, var age: Int){
//
//}
//fun main(){
//    var mybio = bio("soumya",23)
//    println("Name = ${mybio.name}");
//    println("Age = ${mybio.age}");
//}



//////   map


//fun main(args: Array<String>){
//
//    val myMap = mapOf<Int,String>(1 to "Ajay", 4 to "Vijay", 3 to "Prakash")
//    for(key in myMap.keys){
//        println(myMap.get(key))
//    }
//}


///// arraylist

fun main(){
    val myArray = ArrayList<Any>()
//    val list =  mutableListOf<Any>()
//    list.add("soumya")
//    list.add(56)
//    list.add(3.0f)
    myArray.add(2);
    myArray.add(4);
    myArray.add("soumya");

//    myArray.addAll(list)
    myArray.set(2, "kundu")
    myArray.remove("kundu")
    for(i in myArray){
        println(i)
    }

    println("size of arrayList is : ${myArray.size}")
    println("get element 2:  ${myArray.get(1)}")
//    println(myArray.lastIndexOf("soumya"))

}







