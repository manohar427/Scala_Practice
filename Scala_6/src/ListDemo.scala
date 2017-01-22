

object ListDemo {
  def main(arg: Array[String]) {
    var listSample: List[String] = List("One", "Two");
    var setSample: Set[String] = Set("A", "B");

    for (i <- listSample) {
      println(i);
    }
    println("=========");
    for (i <- 0 to listSample.length - 1) {
      println(listSample(i));
    }
  }
}