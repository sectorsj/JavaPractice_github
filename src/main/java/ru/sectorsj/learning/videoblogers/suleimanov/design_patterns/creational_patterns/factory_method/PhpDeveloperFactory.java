package ru.sectorsj.learning.videoblogers.suleimanov.design_patterns.creational_patterns.factory_method;

public class PhpDeveloperFactory implements DeveloperFactory {
	@Override
	public Developer createDeveloper() {
		return new PhpDeveloper();
	}
}
