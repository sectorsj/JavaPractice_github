package dmdev.level2.pack22inputandoutputstreams.practice;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

/**
 * 5. Задан файл с java-кодом. Прочитать текст программы из файла
 * и записать в другой файл в обратном порядке символы каждой строки.
 */

public class Task5 {
	
	public static void main(String[] args) {
		Path path = Path.of("src",
				"main",
				"java",
				"dmdev",
				"pack22inputandoutputstreams",
				"practice",
				"Task4.java");
		Path resultPath = Path.of("resources", "Task4.java");
		
		
		try (Stream<String> lines = Files.lines(path);
		
//		     BufferedWriter bufferedWriter = Files.newBufferedWriter(resultPath, StandardOpenOption.APPEND, StandardOpenOption.CREATE)) {
//		     используем Статический импорт - APPEND CREATE
		     BufferedWriter bufferedWriter = Files.newBufferedWriter(resultPath, APPEND, CREATE)) {
			lines.map(StringBuilder::new)
					.map(StringBuilder::reverse)
					
					// после того как написали эту строку делаем try/catch --->
//					.forEach(line -> bufferedWriter.write(line.toString()));
					
					// получается такая муть
					.forEach(line -> {
						try {
							bufferedWriter.write(line.toString());
							bufferedWriter.newLine();
						} catch (IOException e) {
							e.printStackTrace();
						}
					});
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
