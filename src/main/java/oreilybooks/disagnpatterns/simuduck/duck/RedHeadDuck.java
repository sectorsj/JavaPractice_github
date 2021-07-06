package oreilybooks.disagnpatterns.simuduck.duck;

import oreilybooks.disagnpatterns.simuduck.behavior.FlyWithWings;
import oreilybooks.disagnpatterns.simuduck.behavior.Quack;

public class RedHeadDuck extends Duck {
	
	public RedHeadDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("я рыжая утка");
	}
}
