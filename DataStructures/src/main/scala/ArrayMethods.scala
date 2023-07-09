package DataStructures.src.main.scala

/*
In Scala, both foreach and map are methods available on collections (such as arrays, lists, etc.) that allow you to iterate over elements. However, there are some important differences between the two methods:

  Purpose:
    foreach: The foreach method is used for performing an action or side effect on each element of the collection. It doesn't return a new collection or transform the original collection.
    map: The map method is used for transforming each element of the collection and returning a new collection with the transformed elements.

  Return Value:
    foreach: The foreach method returns Unit (equivalent to void in other languages) because it is primarily used for performing side effects and doesn't produce a new collection.
    map: The map method returns a new collection with the same length as the original collection, where each element has been transformed based on the specified mapping function.

  Immutability:
    foreach: The foreach method doesn't modify the original collection. It operates on each element of the collection but doesn't change their values.
    map: The map method returns a new collection, leaving the original collection unchanged. It applies the transformation function to each element and returns a collection with the transformed values.

*/

object ArrayMethods extends App {
  var arr = Array(10, 20, 30, 50);

  var total = 0;
  arr.foreach(x => total += x);
  // arr.foreach(total += _);  // short hand notation
  println(total);

  var arr2 = arr.map(x => x * 2);
  // var arr2 = arr.map(_ * 2);  // short hand notation
  println(arr2.mkString(", "));

}
