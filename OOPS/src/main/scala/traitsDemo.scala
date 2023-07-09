package OOPS.src.main.scala


trait Vehicle {
  var name: String;
  def getInfo(): String;
}

trait Mercedes extends Vehicle {
  override def getInfo(): String = {
    "Mercedes";
  };
}

trait Duke extends Vehicle {
  override def getInfo() = "Duke";
}

class myDream extends Duke with Mercedes{
  override var name: String = "vampire_questt";
  def sayHello() = "Hello Scala";
}

object traitsDemo extends App {
  var oneDay = new myDream;
  println(oneDay.name);
  println(oneDay.getInfo());
  println(oneDay.sayHello());
}
