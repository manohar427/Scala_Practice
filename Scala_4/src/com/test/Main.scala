package com.test

object Main {
  def main(arg: Array[String]) {
    var calc = new Calc();
    val sum = calc.add(10, 30);
    calc.test(100, 200);
    println("SUM:" + sum);
  }
}
class Calc {
  def add(x: Int, y: Int): Int = {
    return x + y
  }

  def test(x: Int, y: Int) {
    println("Sum:" + (x + y));
  }
}