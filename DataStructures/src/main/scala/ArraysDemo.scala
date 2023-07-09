package DataStructures.src.main.scala

object ArraysDemo extends App {
  var arr: Array[Int] = new Array[Int](5);  // by default all values are 0
  // more ways to declare Array data structure
  // var arr = new Array[Int](5);
  // var arr: Array[Int] = new Array(5);
  println(arr.mkString(", "));

  arr(0) = 10;
  arr(1) = 30;
  arr(4) = 80;

  for(x <- arr){
    print(x + ", ");
  }
  println("");

  // forEach loop on array
  var total = 0;
  arr.foreach(x => total += x);
  println(s"total is $total");

  // declaration + initialization
  var arr2: Array[Int] = Array(10, 20, 30, 80);
  // var arr2 = Array(10, 20, 30, 80);
  println(arr2.mkString(", "));

  // using fill method
  val arr3: Array[Boolean] = Array.fill(3)(true);
  println(arr3.mkString(", "));

  // using tabulate method
  val arr4: Array[Int] = Array.tabulate(5)(_ * 2);
  println(arr4.mkString(", "));

}
