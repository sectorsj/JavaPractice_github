package ru.sectorsj.learning.videoblogers.suleimanov.design_patterns.structural_patterns.adapter;

public class AdapterJavaToDataBase extends JavaApplication implements Database {
	@Override
	public void insert() {
		saveObject();
	}
	
	@Override
	public void update() {
		updateObject();
	}
	
	@Override
	public void select() {
		loadObject();
	}
	
	@Override
	public void remove() {
		deleteObject();
	}
}
