package DataStructures.src.main.scala

/*
In Scala, reduceLeft is a higher-order function available on collections
that allows you to perform a binary operation on the elements of a collection
from left to right, reducing them to a single value.
It applies the specified binary operator between consecutive elements of the collection,
starting from the leftmost element.

SYNTAX: collection.reduceLeft(binaryOperator)

 */

object ArrayMethods2 extends  App {

  var arr = Array(10, 20, 30, 40, 50);

  var sum = arr.reduceLeft((x,y) => {
    println(s"x: $x, y: $y, avg: ${(x+y)}");
    (x+y)
  });
  println(s"Sum: $sum");

  /*
  It's worth noting that reduceLeft assumes that the collection is not empty.
  If you apply reduceLeft to an empty collection, it will throw a UnsupportedOperationException.
  To handle the empty collection case, you can use reduceLeftOption,
  which returns an Option with the result or None if the collection is empty.
   */

  val emptyList = Array.empty[Int];
  val sumOption = emptyList.reduceLeftOption((acc, num) => acc + num)
  println(sumOption) // Output: None


  val someList = Array(10,20,30);
  val sumOption2 = someList.reduceLeftOption((acc, num) => acc + num)
  println(sumOption2) // Output: Some(60)

  // access value from Option
  sumOption2 match {
    case Some(value) => println(value);
    case None => println("None");
  }

}
