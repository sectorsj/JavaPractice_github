package ru.sectorsj.learning.videoblogers.suleimanov.design_patterns.structural_patterns.facade;

public class WorkFlow {
	Developer developer = new Developer();
	Work work = new Work();
	BugTracker bugTracker = new BugTracker();
	
	public void solveProblems() {
		work.doWork();
		bugTracker.startSprint();
		developer.doWorkBeforeDeadline(bugTracker);
	}
}
