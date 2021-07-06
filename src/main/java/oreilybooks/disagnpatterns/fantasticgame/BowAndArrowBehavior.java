package oreilybooks.disagnpatterns.fantasticgame;

public class BowAndArrowBehavior implements WeaponBehavior {
	
	@Override
	public void useWeapon() {
		System.out.println("выстрелил из лука");
	}
}
