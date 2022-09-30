package behaviorImplementations;

import behaviors.IQuackBehavior;

public class Squeak implements IQuackBehavior {

  @Override
  public void quack() {
    System.out.println("Squeaking...");
  }
}
