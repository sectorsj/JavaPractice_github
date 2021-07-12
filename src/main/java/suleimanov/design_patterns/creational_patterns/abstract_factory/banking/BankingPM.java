package suleimanov.design_patterns.creational_patterns.abstract_factory.banking;

import suleimanov.design_patterns.creational_patterns.abstract_factory.ProjectManager;

public class BankingPM implements ProjectManager {
	@Override
	public void manageProject() {
		System.out.println("BankingPM manages the banking project...");
	}
}
