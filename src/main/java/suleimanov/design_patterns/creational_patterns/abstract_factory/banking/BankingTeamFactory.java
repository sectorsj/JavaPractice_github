package suleimanov.design_patterns.creational_patterns.abstract_factory.banking;

import suleimanov.design_patterns.creational_patterns.abstract_factory.Developer;
import suleimanov.design_patterns.creational_patterns.abstract_factory.ProjectManager;
import suleimanov.design_patterns.creational_patterns.abstract_factory.ProjectTeamFactory;
import suleimanov.design_patterns.creational_patterns.abstract_factory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
	@Override
	public Developer getDeveloper() {
		return new JavaDeveloper();
	}
	
	@Override
	public Tester getTester() {
		return new QATester();
	}
	
	@Override
	public ProjectManager getProjectManager() {
		return new BankingPM();
	}
}
