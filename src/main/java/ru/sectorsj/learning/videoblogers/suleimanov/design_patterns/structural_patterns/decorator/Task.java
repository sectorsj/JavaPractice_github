package ru.sectorsj.learning.videoblogers.suleimanov.design_patterns.structural_patterns.decorator;

public class Task {
	public static void main(String[] args) {
		Developer developer = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));
		
		System.out.println(developer.makeJob());
	}
}
