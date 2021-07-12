package suleimanov.design_patterns.structural_patterns.proxy;

public class ProjectRunner {
	public static void main(String[] args) {
		Project project = new ProxyProject("https://github.com/sectorsj/JavaPractice_github");
		
		project.run();
	}
}
