package behaviorImplementations;

import behaviors.IFlyBehavior;

public class FlyWithWings implements IFlyBehavior {

	@Override
	public void fly() {
		System.out.println("Flying with wings...");
	}

}
