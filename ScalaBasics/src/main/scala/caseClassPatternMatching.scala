package ScalaBasics.src.main.scala


case class Car(name: String, cost: Int){
  def getInfo = s"Car name is $name and its cost is $cost";
}

object caseClassPatternMatching extends App {
  val bmw = Car("BMW", 10000000);
  val mercedes = Car("Mercedes", 5000000);
  val fortuner = Car("Fortuner", 2000000);

  for (car <- List(bmw, fortuner, mercedes)){
    car match {
      case Car("Mercedes", 5000000) => println(mercedes.getInfo);
      case Car("BMW", 10000000) => println(bmw.getInfo);
      case _ => println("Some car beyond my science");
    }
  }
}
