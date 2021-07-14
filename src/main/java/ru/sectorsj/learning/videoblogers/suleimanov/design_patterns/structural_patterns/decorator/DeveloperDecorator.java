package ru.sectorsj.learning.videoblogers.suleimanov.design_patterns.structural_patterns.decorator;

public class DeveloperDecorator implements Developer {
	
	Developer developer;
	
	public DeveloperDecorator(Developer developer) {
		this.developer = developer;
	}
	
	@Override
	public String makeJob() {
		return developer.makeJob();
	}
}
