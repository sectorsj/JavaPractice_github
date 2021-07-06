package oreilybooks.disagnpatterns.simuduck.behavior;

import oreilybooks.disagnpatterns.simuduck.behavior.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("я лечу как ракета!");
	}
}
