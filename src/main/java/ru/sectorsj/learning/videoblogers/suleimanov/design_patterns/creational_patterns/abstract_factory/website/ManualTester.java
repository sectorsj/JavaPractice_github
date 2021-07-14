package ru.sectorsj.learning.videoblogers.suleimanov.design_patterns.creational_patterns.abstract_factory.website;

import ru.sectorsj.learning.videoblogers.suleimanov.design_patterns.creational_patterns.abstract_factory.Tester;

public class ManualTester implements Tester {
	@Override
	public void testCode() {
		System.out.println("Manual tester tests code...");
	}
}
