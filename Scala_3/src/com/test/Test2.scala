package com.test

object Test2 {
  def main(args: Array[String]) {
    var array1: Array[Int] = new Array[Int](4); //Approach 1
    var array2 = new Array[String](4); //Approach 2
    var array3 = Array("Apple", "Samsung", "BB"); //Approach 3
    var marks = Array(45,78,12,55,58); //Approach 3
    array1(0) = 9090;
    array2(0) = "Manohar";

    println("0-1:" + array1(0));
    println("0-2:" + array2(0));
    println("0-3:" + array3(0));

    //for loop Example
    for (x <- array3) {
      println(x);
    }
    
    
     //for loop Example
    var total=0;
    for (x <- 0 to marks.length-1) {
      total +=marks(x);
    }
    println("Total Marks:"+total);
    
  }
}