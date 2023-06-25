package OOPS.src.main.scala

// Implicit classes in Scala provide a convenient way to extend existing types
// with new methods or functionality without modifying the original class
// or creating wrapper classes explicitly.

object ImplicitClass extends App {

  // This class extends features of String class of scala
  implicit class DummyClass1(s: String) {
    def getFirstChar = {
      s.charAt(0);
    }
  }

  println("Hello World".getFirstChar);

  // This class extends features of Integer class of scala
  implicit class DummyClass2(x: Int) {
    def increment = x+1;
  }

  val num = 10;
  val num2 = num.increment;
  println(num2);

}
