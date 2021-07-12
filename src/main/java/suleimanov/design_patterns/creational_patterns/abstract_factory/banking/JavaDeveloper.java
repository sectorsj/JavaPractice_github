package suleimanov.design_patterns.creational_patterns.abstract_factory.banking;

import suleimanov.design_patterns.creational_patterns.abstract_factory.Developer;

public class JavaDeveloper implements Developer {
	@Override
	public void writeCode() {
		System.out.println("Java developer write java code...");
	}
}
