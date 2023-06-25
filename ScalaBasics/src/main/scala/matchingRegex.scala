package ScalaBasics.src.main.scala

import scala.util.matching.Regex

object matchingRegex extends App {

  // Method - 1
  val pattern = new Regex("Hello");
  val stringToMatchIn = "Hello world, I am Deepak, Hello again";
  println(pattern findFirstIn(stringToMatchIn));
  println((pattern findAllIn(stringToMatchIn)).mkString(", "));


  // Method - 2
  val pattern2 = "Hello".r;
  println(pattern2 findFirstIn (stringToMatchIn));
  println((pattern2 findAllIn (stringToMatchIn)).mkString(", "));

  // getOrElse
  val somePattern = "Helloooo".r;
  val someStr = "Hello i am deepak";
  println(somePattern.findFirstIn(someStr).getOrElse("No match found"));

  // pattern to find all the numbers present in a string
  val numPat = "[0-9]+".r;
  val str = "Hello I am Deeepak and I am 22 years old, and i have a bike of 260000";
  val nums = (numPat.findAllIn(str)).toArray;
  for (x <- nums){
    println(x);
  }

  // Using regex with foreach
  val pattern3 = "(H|h)ello".r;
  val str3 = "Hello, I am Deepak, hello again";
  pattern3.findAllIn(str3).foreach(x => println(x));

}

