package ru.sectorsj.learning.videoblogers.suleimanov.design_patterns.creational_patterns.builder;

public abstract class WebsiteBuilder {
	Website website;
	
	void createWebsite(){
		website = new Website();
	}
	
	abstract void buildName();
	abstract void buildCms();
	abstract void buildPrice();
	
	Website getWebsite() {
		return website;
	}
}
