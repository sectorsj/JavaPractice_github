package ru.sectorsj.learning.videoblogers.suleimanov.design_patterns.behavioral_patterns.chain;

public class BugTracker {
	public static void main(String[] args) {
		Notifier reportNotifier = new SimpleReportNotifier (Priority.ROUTINE);
		Notifier emailNotifier = new EmailNotifier (Priority.IMPORTANT);
		Notifier smsNotifier = new SMSNotifier (Priority.ASAP);
		
		reportNotifier.setNextNotifier(emailNotifier);
		emailNotifier.setNextNotifier(smsNotifier);
		
		reportNotifier.notifyManager("Everything is OK.", Priority.ROUTINE);
		reportNotifier.notifyManager("Something went wrong!", Priority.IMPORTANT);
		reportNotifier.notifyManager("Huston we have a problem!!!", Priority.ASAP);
	}
}
