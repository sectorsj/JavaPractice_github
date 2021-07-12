package suleimanov.design_patterns.creational_patterns.factory_method;

public class JavaDeveloperFactory implements DeveloperFactory {
	@Override
	public Developer createDeveloper() {
		return new JavaDeveloper();
	}
}
