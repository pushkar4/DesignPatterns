package ducks;

import behaviors.IFlyBehavior;
import behaviors.IQuackBehavior;

public abstract class Duck {

  IQuackBehavior quackBehavior;
  IFlyBehavior flyBehavior;

  public abstract void display();

  public void doQuack() {
    quackBehavior.quack();
  }

  public void doFly() {
    flyBehavior.fly();
  }
}
