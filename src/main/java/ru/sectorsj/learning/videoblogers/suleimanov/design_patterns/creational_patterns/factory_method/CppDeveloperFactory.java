package ru.sectorsj.learning.videoblogers.suleimanov.design_patterns.creational_patterns.factory_method;

public class CppDeveloperFactory implements DeveloperFactory {
	@Override
	public Developer createDeveloper() {
		return new CppDeveloper();
	}
}
