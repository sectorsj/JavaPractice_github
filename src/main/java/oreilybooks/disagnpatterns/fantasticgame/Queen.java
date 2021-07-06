package oreilybooks.disagnpatterns.fantasticgame;

public class Queen extends Character{
	
	public Queen() {
		weaponBehavior = new KnifeBehavior();
	}
	
	@Override
	public void fight() {
		weaponBehavior.useWeapon();
	}
}
