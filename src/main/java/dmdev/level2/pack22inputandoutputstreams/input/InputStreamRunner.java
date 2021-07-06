package dmdev.level2.pack22inputandoutputstreams.input;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;

public class InputStreamRunner {
	
	public static void main(String[] args) throws IOException {
	
//	старый вариант инициализации директории файла
//		File file1 = new File(String.join(File.separator,"resources", "test22-2DMDev.txt"));

// 	современный вариант инициализации директории файла
		File file = Path.of("resources", "test22-2DMDev.txt").toFile();
		
//	используем try-with-resources для реализации интерфейса AutoCloseable,
//	чтобы не забыть закрыть потоки ввода/вывода
		try (FileInputStream inputStream = new FileInputStream(file)) {
		
//	если нам нужно считывать файл не полностью а по частям:
			byte[] bytes = new byte[inputStream.available()];
			int counter = 0;
			byte currentByte;
			while ((currentByte = (byte) inputStream.read()) != -1) {
				bytes[counter++] = currentByte;
			}
			String stringValue = new String(bytes);
			System.out.println(stringValue);
			
//	если нам нужно считывать файл полность:
//			byte[] bytes = inputStream.readAllBytes();
//			String stringValue = new String(bytes);
//			System.out.println(stringValue);
		}
	}
}
