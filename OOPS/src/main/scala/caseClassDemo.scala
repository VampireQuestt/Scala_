package OOPS.src.main.scala

case class Human(val name: String, val age: Int) {
  def getInfo(): String = {
    s"My name is $name and my age is $age";
  }
}

object caseClassDemo extends App {
  println("Hello World!");
  val deepak = new Human("Deepak", 22);
  val shivam = deepak.copy("Deepak", 22);
  val sayan = deepak.copy("Sayan", 21);
  println(deepak.getInfo());
  println(shivam.getInfo());
  println(sayan.getInfo());
  println(deepak == shivam);
  println(deepak == sayan);
  println(sayan == shivam);

}
