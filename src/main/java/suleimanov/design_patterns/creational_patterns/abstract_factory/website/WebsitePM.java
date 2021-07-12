package suleimanov.design_patterns.creational_patterns.abstract_factory.website;

import suleimanov.design_patterns.creational_patterns.abstract_factory.ProjectManager;

public class WebsitePM implements ProjectManager {
	
	@Override
	public void manageProject() {
		System.out.println("WebsitePM manages website project...");
	}
}
