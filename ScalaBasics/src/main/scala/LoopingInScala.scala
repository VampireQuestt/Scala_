package ScalaBasics.src.main.scala

import scala.util.control.Breaks

object LoopingInScala extends App {
  for(i <- 1 to 10){
    println(s"Value of i is $i");
  }

  // nested for loop
  var count = 0;
  for(i <- 1 to 5){
    for(j <- 1 to 5){
      count += 1;
    }
  }
  println(s"value of count is $count");

  // another way of writing nested for loop
  var cnt = 0;
  for(i <- 1 to 5; j <- 1 to 5){
    cnt += 1;
  }
  println(s"Value of cnt is $cnt");

  // looping on Lists with conditions
  val nums = List(1,2,3,4,5,6,7,8,9,10);
  for (x <- nums){
    if(x%2 == 0 && x != 4){
      println(x)
    }
  }

  // another way of writing the same
  for(x <- nums; if x%2 == 0; if x != 4){
    println(x);
  }

  // looping with yield keyword
  val result = for {
    x <- nums
    z = if (x % 2 == 0) {
        val y = x * 10
        y * 100
      }
      else {
        x
      }
  } yield z;

  println(result);


  // No inbuilt break keyword in scala
  val breakObject = new Breaks;
  breakObject.breakable {
    for (i <- 1 to 10){
      if(i == 4){
        println("Breaking at 4");
        breakObject.break;
      }
      else{
        println(s"i : $i");
      }
    }
  }
}
