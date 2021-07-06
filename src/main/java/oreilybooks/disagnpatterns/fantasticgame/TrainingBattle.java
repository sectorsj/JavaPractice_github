package oreilybooks.disagnpatterns.fantasticgame;

public class TrainingBattle {
	
	public static void main(String[] args) {
		Character knight = new Knight();
		Character king = new King();
		Character queen = new Queen();
		Character troll = new Troll();
		
		knight.fight();
		knight.setWeaponBehavior(new AxeBehavior());
		knight.fight();
		king.fight();
		queen.fight();
		troll.fight();
	}
}
