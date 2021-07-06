package oreilybooks.disagnpatterns.fantasticgame;

public class Knight extends Character {
	
	public Knight() {
		weaponBehavior = new BowAndArrowBehavior();
	}
	
	@Override
	public void fight() {
		weaponBehavior.useWeapon();
	}
}
