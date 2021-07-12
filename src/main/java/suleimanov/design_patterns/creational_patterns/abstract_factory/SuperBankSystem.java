package suleimanov.design_patterns.creational_patterns.abstract_factory;

import suleimanov.design_patterns.creational_patterns.abstract_factory.banking.BankingTeamFactory;

public class SuperBankSystem {
	public static void main(String[] args) {
		ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
		Developer developer = projectTeamFactory.getDeveloper();
		Tester tester = projectTeamFactory.getTester();
		ProjectManager projectManager = projectTeamFactory.getProjectManager();
		
		System.out.println("Creating bank system");
		developer.writeCode();
		tester.testCode();
		projectManager.manageProject();
	}
}
