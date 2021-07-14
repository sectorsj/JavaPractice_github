package ru.sectorsj.learning.videoblogers.dmdev.java.level2.pack24dateandtime.practice;


import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * 5. Создать объект LocalDate, представляющий собой сегодняшнюю дату.
 * Создать объект LocalDate, представляющий собой дату 07.07.2018.
 * Использую созданные объекты, найти количество дней между этими
 * двумя датами.
 */

public class Task5 {
	
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDate prevDate = LocalDate.of(2018, 7, 7);
		
		Period period = Period.between(prevDate, now);
		System.out.println("год(а) " + period.getYears());
		System.out.println("месяцев " + period.getMonths());
		System.out.println("дней " + period.getDays());
		
		long days = ChronoUnit.DAYS.between(prevDate, now);
		System.out.println(days);
	}
}
