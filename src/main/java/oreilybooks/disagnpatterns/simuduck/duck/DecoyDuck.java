package oreilybooks.disagnpatterns.simuduck.duck;

import oreilybooks.disagnpatterns.simuduck.behavior.FlyNoWay;
import oreilybooks.disagnpatterns.simuduck.behavior.MuteQuack;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}
	
	@Override
	public void display() {
		System.out.println("я деревянная уточка");
	}
}
