package OOPS.src.main.scala

abstract class VehicleA {
  val name: String;
  def getInfo();
}

trait MercedesA extends VehicleA {
  override val name: String = "Mercedes";

  override def getInfo(): Unit = println("Mercedes is my Dream Car, and very soon I am going to own it");
}

trait DukeA extends VehicleA {
  override val name: String = "Duke";

  override def getInfo(): Unit = println("Duke is my Dream Bike, and I already owned it");

  def topSpeed() = 140;
}

class myDreamA extends DukeA with MercedesA {
  def chaseDream() = {
    println(name);
    getInfo();
  }
}

object abstractClass extends App {
  val vampi = new myDreamA;
  vampi.chaseDream();
  println(vampi.topSpeed());
}
