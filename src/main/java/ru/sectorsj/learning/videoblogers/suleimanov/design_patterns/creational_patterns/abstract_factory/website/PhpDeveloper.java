package ru.sectorsj.learning.videoblogers.suleimanov.design_patterns.creational_patterns.abstract_factory.website;

import ru.sectorsj.learning.videoblogers.suleimanov.design_patterns.creational_patterns.abstract_factory.Developer;

public class PhpDeveloper implements Developer {
	@Override
	public void writeCode() {
		System.out.println("Php developer write php code...");
	}
}
