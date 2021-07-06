package oreilybooks.disagnpatterns.simuduck.duck;

import oreilybooks.disagnpatterns.simuduck.behavior.FlyBehavior;
import oreilybooks.disagnpatterns.simuduck.behavior.QuackBehavior;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
//	String name;
	
	public Duck() {
	
	}
	
//	public Duck(String name) {
//		this.name = name;
//	}

	public abstract void display();

	public void performeFly() {
		flyBehavior.fly();
	}
	
	public void performeQuack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("я плыву, потому что все утки умеют плавать");
	}
	
	public void setFlyBehavior(FlyBehavior fb) {
		this.flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		this.quackBehavior = qb;
	}
}
