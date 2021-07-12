package suleimanov.design_patterns.creational_patterns.abstract_factory.banking;

import suleimanov.design_patterns.creational_patterns.abstract_factory.Tester;

public class QATester implements Tester {
	@Override
	public void testCode() {
		System.out.println("QA tester tests banking code...");
	}
}
