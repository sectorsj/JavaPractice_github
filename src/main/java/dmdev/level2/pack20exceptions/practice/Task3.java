package dmdev.level2.pack20exceptions.practice;

import dmdev.level2.pack20exceptions.SectorSJException;

/**
 *3. Создать собственный класс-исключение - наследник класса Exception.
 *Создать метод, выбрасывающий это исключение.
 *Вызвать этот метод и отловить исключение.
 *Вывести stack trace в консоль.
 */
public class Task3 {
	public static void main(String[] args) {
		try {
			unsafe();
		} catch (SectorSJException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
	
	public static void unsafe() throws SectorSJException {
		throw new SectorSJException(new RuntimeException("runtime exception"));
	}
}
