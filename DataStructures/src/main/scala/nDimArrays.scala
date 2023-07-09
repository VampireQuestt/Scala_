package DataStructures.src.main.scala

object nDimArrays extends App {
  // Method-1
  var mat1 = Array(Array(1,6,3,0), Array(8,5,6,2), Array(0,1,5,7));
  mat1.foreach(row => println(row.mkString(", ")));

  // access elements by specifying row and column number
  println(mat1(1)(2));

  // Method-2
  var mat2 = Array.ofDim[Int](3,4);
  mat2(0)(2) = 5;
  mat2(1)(1) = 10;
  mat2(2)(3) = 40;
  mat2.foreach(row => println(row.mkString(", ")));

  /*
  We can extend this approach to create arrays of higher dimensions
  by nesting arrays further. For example, to create a 3-dimensional array,
  we can use Array.ofDim[Int](x, y, z) with the desired dimensions.
   */
  println("____________")
  var arr3d = Array.ofDim[Int](4,3,2);
  for(x <- arr3d){
    for(y <- x){
      for(z <- y){
        print(z + ", ")
      }
      println(" ");
    }
    println("____________");
  }
}
