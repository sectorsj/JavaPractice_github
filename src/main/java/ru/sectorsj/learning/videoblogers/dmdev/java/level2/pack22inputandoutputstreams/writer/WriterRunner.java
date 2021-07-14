package ru.sectorsj.learning.videoblogers.dmdev.java.level2.pack22inputandoutputstreams.writer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class WriterRunner {
	
	public static void main(String[] args) throws IOException {
	
//		File file = Path.of("resources", "writer.poem").toFile();
//		Path path = Path.of("resources", "writer.poem");
		Path path = Path.of("resources", "writer2.poem");
		
		Files.write(path, List.of("Hello world!", "Java"));
		
		
//		try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file, true))) {

//		try (BufferedWriter fileWriter = Files.newBufferedWriter(path)) {
//			fileWriter.append("Hello world!");
//			fileWriter.newLine();
//			fileWriter.append("Java");
//		}
	}
}
