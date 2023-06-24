package OOPS.src.main.scala


class Person(a: String, b: Int){   // Primary constructor
  val name = a;
  val age = b;

  def getInfo(): String = {  // method
    s"My name is $name and my age is $age";
  }

  def this() {  // Auxiliary constructors with no parameters
    this("Deepak", 22);
  }

  def this(a: String) {  // Auxiliary constructors with one parameter
    this(a, 22);
  }
}
object Constructors extends App {
  println("Hello World");
  val vampi = new Person("Vampi", 22);
  println(vampi.name);
  println(vampi.age);
  println(vampi.getInfo);

  val deepak = new Person;
  println(deepak.getInfo);

  val shivam = new Person("Shivam");
  println(shivam.getInfo);
}
