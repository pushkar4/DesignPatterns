package behaviorImplementations;

import behaviors.IFlyBehavior;

public class FlyNoWay implements IFlyBehavior {

	@Override
	public void fly() {
		System.out.println("Cannot fly...");
	}
	
}
