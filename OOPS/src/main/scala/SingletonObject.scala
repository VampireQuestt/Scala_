package OOPS.src.main.scala

object Deepak {
  val age = 22;
  val comapny = "Verdis";

  def getInfo(): String = {
    s"My age is $age and I work in $comapny";
  }
}

object SingletonObject extends App {
  println("Hello World!");
  println(Deepak.getInfo);
}
