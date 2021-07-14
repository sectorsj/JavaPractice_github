package ru.sectorsj.learning.videoblogers.suleimanov.design_patterns.creational_patterns.abstract_factory.banking;

import ru.sectorsj.learning.videoblogers.suleimanov.design_patterns.creational_patterns.abstract_factory.Tester;

public class QATester implements Tester {
	@Override
	public void testCode() {
		System.out.println("QA tester tests banking code...");
	}
}
