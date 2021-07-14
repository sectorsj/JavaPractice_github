package ru.sectorsj.learning.videoblogers.suleimanov.design_patterns.creational_patterns.abstract_factory.banking;

import ru.sectorsj.learning.videoblogers.suleimanov.design_patterns.creational_patterns.abstract_factory.ProjectManager;

public class BankingPM implements ProjectManager {
	@Override
	public void manageProject() {
		System.out.println("BankingPM manages the banking project...");
	}
}
