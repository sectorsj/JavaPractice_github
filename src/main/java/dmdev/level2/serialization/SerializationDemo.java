package dmdev.level2.serialization;

/**
 * почитать книгу Д.Блох "Java эффективное программирование"
 */

import java.io.*;
import java.nio.file.Path;

public class SerializationDemo {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Path path = Path.of("resources", "student.out");
		
//		writeObject(path);
		readObject(path);
	}
	
	private static void readObject(Path path) throws IOException, ClassNotFoundException {
		try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path.toFile()))) {
			Object object = objectInputStream.readObject();
			System.out.println(object);
		}
	}
	
	/**
	 * new ObjectOutputStream(new FileOutputStream(path.toFile())) --->
	 * 1. делаем try-with-resources
	 * 2. пробрасываем исключение в сигнатуру метода main (throws IOException)
	 */
	private static void writeObject(Path path) throws IOException {
		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path.toFile()))) {
			PersonForSerialization sergey = new PersonForSerialization(26, "Sergey");
			objectOutputStream.writeObject(sergey);
		}
	}
}
