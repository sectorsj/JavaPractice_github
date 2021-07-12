package suleimanov.design_patterns.creational_patterns.abstract_factory;

public interface ProjectTeamFactory {
	Developer getDeveloper();
	Tester getTester();
	ProjectManager getProjectManager();
	
}
