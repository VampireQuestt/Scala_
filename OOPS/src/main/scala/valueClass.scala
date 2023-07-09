package OOPS.src.main.scala

// To define a value class in Scala,
// you need to extend the AnyVal marker trait and define
// a primary constructor that takes a single parameter.

// The use case for value classes is to provide a convenient and efficient way
// to introduce additional semantics or behavior to primitive types
// without incurring the overhead of object creation and memory allocation.

// By using value classes, you can achieve better performance and
// reduce memory footprint while working with primitive-like types.

class Meter(val value: Double) extends AnyVal {
  def +(other: Meter): Meter = new Meter(value + other.value)
  def -(other: Meter): Meter = new Meter(value - other.value)
  def toCentimeter: Double = value * 100
}

object valueClass extends App {
  val length1 = new Meter(5.0);
  val length2 = new Meter(3.0)

  val sum = length1 + length2
  val difference = length1 - length2
  val centimeters = length1.toCentimeter

  println(sum.value) // Output: 8.0
  println(difference.value) // Output: 2.0
  println(centimeters) // Output: 500.0

}
