package ducks;

import behaviorImplementations.FlyWithWings;
import behaviorImplementations.Quack;

public class WildDuck extends Duck {

  public WildDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  public void display() {
    System.out.println("I am a Wild duck.");
    doQuack();
    doFly();
    System.out.println();
  }
}
