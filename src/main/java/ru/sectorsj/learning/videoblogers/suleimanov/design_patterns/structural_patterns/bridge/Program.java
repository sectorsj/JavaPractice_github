package ru.sectorsj.learning.videoblogers.suleimanov.design_patterns.structural_patterns.bridge;

public abstract class Program {
	protected Developer developer;
	
	protected Program(Developer developer) {
		this.developer = developer;
	}
	
	public abstract void developProgram();
}
