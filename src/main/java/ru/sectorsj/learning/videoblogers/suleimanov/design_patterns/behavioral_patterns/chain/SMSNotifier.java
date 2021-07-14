package ru.sectorsj.learning.videoblogers.suleimanov.design_patterns.behavioral_patterns.chain;

public class SMSNotifier extends Notifier{
	
	public SMSNotifier(int priority) {
		super(priority);
	}
	
	@Override
	protected void write(String message) {
		System.out.println("Sending SMS to manager: " + message);
	}
}
