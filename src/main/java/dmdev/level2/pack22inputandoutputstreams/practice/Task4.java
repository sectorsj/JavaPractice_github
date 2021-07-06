package dmdev.level2.pack22inputandoutputstreams.practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * 4. Задан файл с java-кодом. Прочитать текст программы из файла
 * и все слова public в объявлении аттрибутов и методов класса
 * заменить на слова private. Результат сохранить в другой заранее
 * созданный файл.
 */

public class Task4 {
	
	public static void main(String[] args) throws IOException {
//	                Этапы:

//		Считываем весь файл, представили его в виде одной строки --->
		Path path = Path.of("src",
				"main",
				"java",
				"dmdev",
				"pack22inputandoutputstreams",
				"practice",
				"Task3.java");
		String stringValue = Files.readString(path);
		
//      Определили что на что будем заменять --->
		String result = stringValue.replace("public", "private");
		
//      Создали новый файл, и записали в него эту строку при помощи метода writeString () класса Files  --->
		Path resultPath = Path.of("resources", "Task3.java");
		Files.writeString(resultPath, result);
	}
}
