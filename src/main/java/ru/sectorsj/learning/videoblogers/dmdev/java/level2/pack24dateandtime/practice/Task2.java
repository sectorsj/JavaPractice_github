package ru.sectorsj.learning.videoblogers.dmdev.java.level2.pack24dateandtime.practice;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 2. Создать объект LocalDate, представляющий собой сегодняшнюю дату.
 * Преобразовать дату в строку вида "05.05.2017".
 * Вывести эту строку на консоль.
 */
public class Task2 {
	
	public static void main(String[] args) {
//	    дата
		LocalDate now = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		String format = now.format(formatter);
		System.out.println(format);
		
		
//	    дата и время
		LocalDateTime now1 = LocalDateTime.now();
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
		String format1 = now1.format(formatter1);
		System.out.println(format1);
	}
}
