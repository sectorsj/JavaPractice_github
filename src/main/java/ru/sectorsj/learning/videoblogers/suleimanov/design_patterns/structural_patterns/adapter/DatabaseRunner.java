package ru.sectorsj.learning.videoblogers.suleimanov.design_patterns.structural_patterns.adapter;

public class DatabaseRunner {
	public static void main(String[] args) {
		Database database = new AdapterJavaToDataBase();
		
		database.insert();
		database.update();
		database.select();
		database.remove();
	}
}
