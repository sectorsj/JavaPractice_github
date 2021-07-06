package oreilybooks.disagnpatterns.fantasticgame;

public abstract class Character {
	WeaponBehavior weaponBehavior;
	
	String name;
	
	public Character() {}
	
	public void fight() {
		weaponBehavior.useWeapon();
	}
	
	public void setWeaponBehavior(WeaponBehavior wb) {
		this.weaponBehavior = wb;
	}
}
