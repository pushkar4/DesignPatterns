package behaviorImplementations;

import behaviors.IQuackBehavior;

public class Quack implements IQuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quacking...");
	}

}
