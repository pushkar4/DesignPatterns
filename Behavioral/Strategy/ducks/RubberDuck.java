package ducks;

import behaviorImplementations.FlyNoWay;
import behaviorImplementations.Squeak;

public class RubberDuck extends Duck {

	public RubberDuck() {
		quackBehavior = new Squeak();
		flyBehavior = new FlyNoWay();
	}
	
	public void display() {
		System.out.println("I am a Rubber duck.");
		doQuack();
		doFly();
		System.out.println();
	}

}
