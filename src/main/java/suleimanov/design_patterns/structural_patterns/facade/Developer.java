package suleimanov.design_patterns.structural_patterns.facade;

public class Developer {
	public void doWorkBeforeDeadline(BugTracker bugTracker) {
		if (bugTracker.isActiveSprint()) {
			System.out.println("Developer is solving a problems...");
		} else {
			System.out.println("Developer is reading a Habr.ru...");
		}
	}
}
