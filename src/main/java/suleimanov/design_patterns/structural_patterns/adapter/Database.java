package suleimanov.design_patterns.structural_patterns.adapter;

public interface Database {
	
	public void insert();
	
	public void update();
	
	public void select();
	
	public void remove();
}
