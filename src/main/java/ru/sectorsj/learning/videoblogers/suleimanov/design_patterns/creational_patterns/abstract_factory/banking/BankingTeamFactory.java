package ru.sectorsj.learning.videoblogers.suleimanov.design_patterns.creational_patterns.abstract_factory.banking;

import ru.sectorsj.learning.videoblogers.suleimanov.design_patterns.creational_patterns.abstract_factory.Developer;
import ru.sectorsj.learning.videoblogers.suleimanov.design_patterns.creational_patterns.abstract_factory.ProjectManager;
import ru.sectorsj.learning.videoblogers.suleimanov.design_patterns.creational_patterns.abstract_factory.ProjectTeamFactory;
import ru.sectorsj.learning.videoblogers.suleimanov.design_patterns.creational_patterns.abstract_factory.Tester;

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
