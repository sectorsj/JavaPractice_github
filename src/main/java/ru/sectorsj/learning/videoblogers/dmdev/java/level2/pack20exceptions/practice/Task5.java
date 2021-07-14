package ru.sectorsj.learning.videoblogers.dmdev.java.level2.pack20exceptions.practice;

import ru.sectorsj.learning.videoblogers.dmdev.java.level2.pack20exceptions.SectorSJException;

/**
 *5. Бросить одно из существующих в JDK исключений, отловить его и
 * выбросить свое собственное, указав в качестве причины отловленное.
 */
public class Task5 {
	public static void main(String[] args) {
		try {
			catchCustomException();
		} catch (SectorSJException exception) {
			System.out.println("catched in main");
			exception.printStackTrace();
		}
	}
	
	public static void catchCustomException() {
		try{
			unsafe();
		} catch (RuntimeException exception) {
			System.out.println("catch int catchCustomException method");
			throw new SectorSJException(exception);
		}
	}
	
	public static void unsafe() {
		throw new RuntimeException("Oooops");
	}
}
