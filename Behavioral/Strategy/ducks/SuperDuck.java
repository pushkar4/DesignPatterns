package ducks;

import behaviorImplementations.FlyWithRocket;
import behaviorImplementations.Quack;

public class SuperDuck extends Duck {

  public SuperDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithRocket();
  }

  public void display() {
    System.out.println("I am a Super duck.");
    doQuack();
    doFly();
    System.out.println();
  }
}
