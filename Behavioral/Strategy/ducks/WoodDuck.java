package ducks;

import behaviorImplementations.FlyNoWay;
import behaviorImplementations.Mute;

public class WoodDuck extends Duck {

	public WoodDuck() {
		quackBehavior = new Mute();
		flyBehavior = new FlyNoWay();
	}
	
	public void display() {
		System.out.println("I am a Wood duck.");
		doQuack();
		doFly();
		System.out.println();
	}
}
