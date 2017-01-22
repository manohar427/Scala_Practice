

object ListDemo {
  def main(arg: Array[String]) {
    var listSample: List[String] = List("One", "Two");
    var setSample: Set[String] = Set("A", "B");
    var s: Set[Int] = Set(1, 3, 5, 7)
    for (i <- listSample) {
      println(i);
    }
    println("=========");
    for (i <- 0 to listSample.length - 1) {
      println(listSample(i));
    }
  }
}