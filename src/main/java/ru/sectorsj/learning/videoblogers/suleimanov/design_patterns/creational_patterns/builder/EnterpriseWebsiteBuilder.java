package ru.sectorsj.learning.videoblogers.suleimanov.design_patterns.creational_patterns.builder;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder {
	
	@Override
	void buildName() {
		website.setName("Enterprise web site");
	}
	
	@Override
	void buildCms() {
		website.setCms(Cms.ALIFRESCO);
	}
	
	@Override
	void buildPrice() {
		website.setPrice(10000);
	}
}
