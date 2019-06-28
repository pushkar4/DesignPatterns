package behaviorImplementations;

import behaviors.IFlyBehavior;

public class FlyWithRocket implements IFlyBehavior {

	@Override
	public void fly() {
		System.out.println("Flying with rockets...");
	}
	
}
