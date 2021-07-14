package ru.sectorsj.learning.videoblogers.suleimanov.design_patterns.behavioral_patterns.chain;

public class SimpleReportNotifier extends Notifier{
	
	
	public SimpleReportNotifier(int priority) {
		super(priority);
	}
	
	@Override
	protected void write(String message) {
		System.out.println("Notifying using simple report: " + message);
	}
}
