package ru.sectorsj.learning.videoblogers.dmdev.java.level2.pack20exceptions;

public class SectorSJException extends RuntimeException {
	
	public SectorSJException(String message) {
		super(message);
	}
	
	public SectorSJException(Throwable cause) {
		super(cause);
	}
}
