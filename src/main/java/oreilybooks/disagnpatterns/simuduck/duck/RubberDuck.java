package oreilybooks.disagnpatterns.simuduck.duck;

import oreilybooks.disagnpatterns.simuduck.behavior.FlyNoWay;
import oreilybooks.disagnpatterns.simuduck.behavior.Squeak;

public class RubberDuck extends Duck{
	
	public RubberDuck() {
		quackBehavior = new Squeak();
		flyBehavior = new FlyNoWay();
	}
	
	@Override
	public void display() {
		System.out.println("я резиновая уточка");
	}
}
