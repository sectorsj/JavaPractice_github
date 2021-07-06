package oreilybooks.disagnpatterns.simuduck.behavior;

import oreilybooks.disagnpatterns.simuduck.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("...");
	}
}
