package suleimanov.design_patterns.behavioral.strategy;

public class Developer {
	Activity activity;
	
	public void setActivity(Activity activity) {
		this.activity = activity;
	}
	
	public void executeActivity() {
		activity.justDoIt();
	}
}
