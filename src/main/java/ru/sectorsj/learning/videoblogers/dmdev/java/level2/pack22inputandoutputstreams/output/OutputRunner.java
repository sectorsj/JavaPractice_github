package ru.sectorsj.learning.videoblogers.dmdev.java.level2.pack22inputandoutputstreams.output;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;

public class OutputRunner {
	
	public static void main(String[] args) throws IOException {
		File file = Path.of("resources", "output.txt").toFile();
//		try (FileOutputStream outputStream = new FileOutputStream(file, true)) {
		try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file, true))) {
			String value = "Hello world!";
			outputStream.write(value.getBytes());
			
//			outputStream.write("\r\n".getBytes());
			outputStream.write(System.lineSeparator().getBytes());
		}
	}
}
