package behaviorImplementations;

import behaviors.IQuackBehavior;

public class Mute implements IQuackBehavior {

  @Override
  public void quack() {
    System.out.println("Muted...");
  }
}
