package suleimanov.design_patterns.creational_patterns.abstract_factory.website;

import suleimanov.design_patterns.creational_patterns.abstract_factory.Developer;
import suleimanov.design_patterns.creational_patterns.abstract_factory.ProjectManager;
import suleimanov.design_patterns.creational_patterns.abstract_factory.ProjectTeamFactory;
import suleimanov.design_patterns.creational_patterns.abstract_factory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
	@Override
	public Developer getDeveloper() {
		return new PhpDeveloper();
	}
	
	@Override
	public Tester getTester() {
		return new ManualTester();
	}
	
	@Override
	public ProjectManager getProjectManager() {
		return new WebsitePM();
	}
}
