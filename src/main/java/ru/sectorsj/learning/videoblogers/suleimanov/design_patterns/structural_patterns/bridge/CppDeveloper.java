package ru.sectorsj.learning.videoblogers.suleimanov.design_patterns.structural_patterns.bridge;

public class CppDeveloper implements Developer {
	@Override
	public void writeCode() {
		System.out.println("C++ developer writes C++ code...");
	}
}
