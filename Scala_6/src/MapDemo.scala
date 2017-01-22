

object MapDemo {
  def main(arg:Array[String]){
    var mobiles:Map[String,Int] = Map("Apple"->5000,"Samsung"->3000);
    
    println(mobiles);
    println(mobiles.get("Samsung"));
  }
}