package ru.sectorsj.learning.videoblogers.suleimanov.design_patterns.creational_patterns.prototype;

public class VersionControlRunner {
	public static void main(String[] args) {
		Project master = new Project(
				1,
				"SuperProject",
				"Sourcecode sourceCode = new SourceCode();"
		);
		
		System.out.println(master);
		
		ProjectFactory factory = new ProjectFactory(master);
		Project masterClone = factory.cloneProject();
		
		System.out.println("\n=========================\n");
		System.out.println(masterClone);
	}
}
