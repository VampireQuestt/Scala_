package ScalaBasics.src.main.scala

object PatternMatching extends App {

  def matchPattern(x: Any): Any = {
    x match {
      case 1 => "One"
      case 2 => "Two"
      case "Three" => 3
      case 0.5 => "Half"
      case "Half" => 0.5
      case _ => "Something beyond my science"
    }
  }

  println(matchPattern(1));
  println(matchPattern(2));
  println(matchPattern(0.5));
  println(matchPattern("Three"));
  println(matchPattern("Half"));
  println(matchPattern(5));
}
