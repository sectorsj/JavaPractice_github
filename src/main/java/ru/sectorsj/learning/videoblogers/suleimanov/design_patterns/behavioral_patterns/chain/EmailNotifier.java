package ru.sectorsj.learning.videoblogers.suleimanov.design_patterns.behavioral_patterns.chain;

public class EmailNotifier extends Notifier {
	
	public EmailNotifier(int priority) {
		super(priority);
	}
	
	@Override
	protected void write(String message) {
		System.out.println("Sending email: " + message);
	}
}
