package ru.sectorsj.learning.videoblogers.suleimanov.design_patterns.behavioral_patterns.strategy;

public class Developer {
	Activity activity;
	
	public void setActivity(Activity activity) {
		this.activity = activity;
	}
	
	public void executeActivity() {
		activity.justDoIt();
	}
}
